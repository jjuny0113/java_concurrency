package thread.control;

import util.ThreadUtils;

public class CheckecdExceptionMain {
    public static void main(String[] args) throws Exception{
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable{
        @Override
        public void run() {
            ThreadUtils.sleep(1000);
        }
    }
}
