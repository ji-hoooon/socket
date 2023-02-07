package ex01;

import java.io.*;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx04 {
    //버퍼에 소켓을 연결하면 어떤 프로그램에도 모니터로 출력이 가능하다.
    public static void main(String[] args)  {
        //FileReader r= new FileReader();
        //BufferedReader, BufferedWriter
        //로 파일에 소켓을 달면, 파일정보를 가져올 수 있다.

        //스트림이기 때문에 바이트하나만을 쓸 수 있다.
        OutputStream out = System.out;  //모니터에 연결된 스트림
        OutputStreamWriter ow = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(ow);
        //버퍼를 이용해 모니터에 쓰기



        try {
//            out.write(65);
//            out.flush();    //flush 해야 전송이 된다.
            //단점 : 한자만 보낼 수 있다.

            //버퍼 적용
            bw.write("안녕하세요");
            bw.flush();
        }catch (Exception e){

        }
    }
}
