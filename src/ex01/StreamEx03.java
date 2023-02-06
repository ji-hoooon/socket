package ex01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx03 {
    public static void main(String[] args) {
        InputStream in =  System.in;
        InputStreamReader reader =  new InputStreamReader(in);  //정수를 char로 인코딩하는 객체 (아스키코드를 기준으로)
        //InputStreamReader in =  new InputStreamReader(System.in);

        //:Scanner의 내부 동작 방식
        //Scanner sc = new Scanner(System.in);
        //InputStreamReader가 BufferedReader로 감싸져 있다.

        BufferedReader br = new BufferedReader(reader);   //가변길이의 데이터를 받을 수 있음
        //버퍼의 사이즈 8192가 기본 사이즈
        //데코레이터 패턴 : 하나를 잘 만들어서 감싸서 만들고, 감싸서 만드는 것 - 장식하듯이 감싸는 것

        //메서드 실행시, 사용자의 키보드 입력을 기다림
        //: InputStreamReader는 고정길이를 전달할때만 사용
        //: 고정길이가 아니라 가변길이로 사용하기위해서는 버퍼를 사용

        //InputStreamReader은 하나의 바이트뿐 아니라 여러개의 바이트를 받을 수 있다.
        //: 키보드로부터 소켓을 타고 자바 프로그램으로 바이트 스트림
        try{
            String inData=br.readLine();
            System.out.println(inData);
        }catch (Exception e){

        }
    }
}
