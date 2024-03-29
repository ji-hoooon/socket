package singleserver.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    //GET 응답(자원을 주세요)
    public MyServer() throws Exception{
        //전이중

        //1. 서버 대기중
        ServerSocket serverSocket=new ServerSocket(10000);

        //1-2. 데몬
        //: 다른 사람 요청을 받기위해 응답후에 다시 돌아간다.
        while (true) {
            Socket socket = serverSocket.accept();  //요청을 기다리면서, 소켓을 반환 : 랜덤포트로 만들어서 반환 -> 리스너
            System.out.println("클라이언트가 연결되었습니다.");

            //2. 서버 요청 받음
            BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
            //받은 요청을 UTF-8로 인코딩

            String msg = request.readLine();    //클라가 BW해야 서버가 BR가능
            System.out.println("클라이언트에게서 요청이 왔습니다 : " + msg);
            //3. 데몬 테스트 10초대기
            Thread.sleep(10000); //응답 시간 10초걸린다.

            //4. 서버 응답 (반이중) -> BufferedWriter+ new OutputStreamWriter 가 구현되어있는 Wrapper 클래스 PrintWriter
            PrintWriter response = new PrintWriter(socket.getOutputStream(), true); //autoFlush 적용, \n 적용

            //요청의 분기
            if (msg.contains("html")) {
                response.println("<html><h1>Hello</h1></html>");

            } else if (msg.contains("xml")) {
                response.println("<xml>hello</xml>");
            } else {
                response.println("잘못된 요청을 했습니다.");
            }

            //스캐너의 경우에도 BufferedReader를 이용해 구현되어있음

            System.out.println("클라이언트에게 응답합니다.");
            System.out.println("====================");
        }
    }

    public static void main(String[] args) {
        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
