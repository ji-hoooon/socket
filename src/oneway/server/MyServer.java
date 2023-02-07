package oneway.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    //단방향 서버
    //서버 소켓 (리스너) 생성 -> 클라이언트가 연결 -> 클라이언트에 BufferedReader를 달아서 원하는 메세지를 전달 (flush필요)
    //클라이언트와 서버와의 소켓이 생성된다.

    //모니터 연결하는 System.out 위치에 소켓 아웃풋스트림을 건다.
    //System.in 자리에 소켓에 input스트림을 건다 하지만, 버퍼를 이용해 가변길이를 전달한다. ->flush
    //payload자리에 readLine을 전달 -> \n을 보고 버퍼를 끊을곳을 알려준다.
    public MyServer() throws IOException { //예외를 선언해서 호출한 곳에서 하도록 미룬다.
        //1. 서버 대기중
        //: 백그라운드 프로그램으로 통신이 필요
        //포트번호 인자로 전달
        ServerSocket serverSocket=new ServerSocket(10000);  //서버 생성
        Socket socket=serverSocket.accept();    //클라이언트 연결 대기 : 클라이언트가 연결될때까지 멈춘다.-> 클라이언트가 포트로 들어올떄까지 대기
        //리스너 : 사용자가 요청할때까지 이벤트를 기다리는 역할-> while (요청을 바로바로 처리하기 위해서 지속적으로 관찰)

        System.out.println("클라이언트 연결 완료");


        // 2. 서버 메시지 읽음
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
        String msg = reader.readLine(); // 버퍼에 \n까지 읽음 -> 버퍼에 담긴지 확인하는 리스너로
        //: \n이 들어와야 읽는 작업 수행

        System.out.println("받은 메시지 : "+msg);
    }

    public static void main(String[] args) {
        try{
            new MyServer();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
