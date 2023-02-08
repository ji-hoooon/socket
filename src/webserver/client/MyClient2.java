package webserver.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient2 {
    //GET 요청(자원을 주세요)
    //반이중
    public MyClient2() throws Exception{
        //1. 서버 연결
        Socket socket = new Socket("localhost", 10000); //포트번호가 존재하지 않는 오류발생시 catch에서 제어
        PrintWriter request = new PrintWriter(socket.getOutputStream(), true);  //autoFlush + \n

        //2. 클라이언트가 요청함 : 클라이언트는 메시지 프로토콜을 인지해야함 -> 서버가 갑인 인터페이스
        //:xml,html을 요청할 수 있다는 것을 알아야 한다.

        request.println("클라이언트2의 요청 xml페이지 주세요");
//        request.println("xml");
//        request.println("json");
        //자동 flush, \n 자동 붙임

        //3. 클라이언트가 서버의 응답을 받음
        BufferedReader response = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
        String msg = response.readLine();   //서버가 전송한 응답을 받음
        System.out.println("서버로부터 응답이 왔습니다.: "+msg);

    }

    public static void main(String[] args) {
        try {
            new MyClient2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
