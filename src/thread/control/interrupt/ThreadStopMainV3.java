package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV3 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
       Thread thread =  new Thread(task, "work");
        thread.start();
        sleep(100);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run(){

            while (!Thread.currentThread().isInterrupted()) { // 인트럽트 상태 변경x
                log("작업중");

            }
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
            try {
                log("작업정리");
                Thread.sleep(1000);
                log("자원종료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인트럽트 상태=" + Thread.currentThread().isInterrupted());
            }
            log("작업 종료");
        }
    }
}
