package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }

    public static void main(String[] args) {
        log("main() start");
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        log("main() end");

    }
}