package java_code.danyuan30.d9_tz;

/**
 *   实现 Runnable接口
 */
public class MyRunnable implements Runnable{
    private int count;

    //  重写 run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this) {        //  同步代码块（悲观锁）
                System.out.println("Count ====> "+ (++count));
            }
        }
    }
}
