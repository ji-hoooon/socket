package ex01;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx02 {
    public static void main(String[] args) {
        InputStream in =  System.in;
        InputStreamReader reader =  new InputStreamReader(in);  //정수를 char로 인코딩하는 객체 (아스키코드를 기준으로)
        //InputStreamReader in =  new InputStreamReader(System.in);
        //메서드 실행시, 사용자의 키보드 입력을 기다림
        //: InputStreamReader는 고정길이를 전달할때만 사용
        //: 고정길이가 아니라 가변길이로 사용하기위해서는 버퍼를 사용

        //InputStreamReader은 하나의 바이트뿐 아니라 여러개의 바이트를 받을 수 있다.
        //: 키보드로부터 소켓을 타고 자바 프로그램으로 바이트 스트림
        try{
            //4바이트짜리 배열 (버퍼 X, 고정길이 이므로)
            char[] inData = new char[2];    //4바이트 -char는 2바이트
            reader.read(inData);
            //AB : 65

            System.out.println(inData);
        }catch (Exception e){

        }
    }
}
