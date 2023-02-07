package oneway.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClient {
    //단방향 클라이언트

    public MyClient() throws IOException {
        //1. 서버 연결 - 소켓을 통해 연결
        Socket socket =new Socket("localhost",10000); //localhost는 자기자신의 IP주소 (루프백주소 : 자기 컴퓨터로 들어오기 때문에)
        //서버의 IP와 포트번호를 알아야한다. 예외처리 옵션 엔터, 컨트롤엔터는 생성자
        // 2. 메시지 전송
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
        //쓰기방향으로 스트림 생성해 버퍼생성

        writer.write("Hello World");
        writer.write("\n"); // 버퍼에 끝을 알려주는 프로토콜
        writer.flush(); // 버퍼에 담긴 메시지를 전송
        //애플리케이션 레이어 (응용 계층) -> 전송 계층 : 바이트 스트림 (바이너리 데이터)
        //소켓 -> TCP/IP 레이어 -> 랜카드 -> 서버로 전송 : 패킷 -> 세그먼트 전송
    }

    public static void main(String[] args) {
        try{
            new MyClient();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
