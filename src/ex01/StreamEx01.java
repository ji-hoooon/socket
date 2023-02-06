package ex01;

import java.io.InputStream;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx01 {
    public static void main(String[] args) {
        InputStream in =  System.in;    //키보드 스트림
        //메서드 실행시, 사용자의 키보드 입력을 기다림
        //InputStream은 하나의 바이트만 받을 수 있다.
        //: 키보드로부터 소켓을 타고 자바 프로그램으로 바이트 스트림
        try{
            int inData=in.read();   // A= 65 (아스키코드) 0=48
            //AB : 65 (하나만 보낼 수 밖에 없다.)
//            System.out.println(inData);
            System.out.println((char)inData);
        }catch (Exception e){

        }
    }
}
