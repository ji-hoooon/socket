package ex02;

class SubThread implements Runnable{
    //스레드의 조건 : Runnable 인터페이스 구현 -> 추상메서드 run 구현

    //서브 스레드 -> 서브스레드의 생명주기 -> run 메서드의 호출시부터 종료시까지
    @Override
    public void run() {
        //System.out.println("서브스레드 실행");
        for(int i=0;i<6;i++) {   //6바퀴 도는 반복문
            System.out.println("서브 스레드:" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadEx01 {

    //메인 스레드 생성 -> 메인메서드 범위가 프로그램의 생명 주기
    public static void main(String[] args) {
        //실행 -> 프로세스화 -> 싱글 스레드
        //while(true) : 끝나지 않는 데몬 스레드가 된다. -> 리소스를 모두 할당해 문맥교환 불가 -> sleep() 1000 -> 1초

        //OS에게 스레드 생성 요청
        Thread t1 = new Thread(new SubThread());    //실행할 타겟을 지정해 서브스레드를 전달하기 위해
        //Runnable 인터페이스를 구현한 클래스만 가능
        t1.start(); //os가 만들어진 스레드를 이용해 스레드 실행 -> run실행-> 실행 분기 :메인 스레드와 서브 스레드로 분기

        for(int i=0;i<6;i++){   //6바퀴 도는 반복문
            System.out.println("메인 스레드:"+ i);
            //서브 스레드로 전환하기 위해
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //서브스레드 실행 후 스레드 종료
    }
}
