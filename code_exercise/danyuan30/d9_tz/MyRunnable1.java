package java_code.danyuan30.d9_tz;

import java.util.concurrent.atomic.AtomicInteger;


/**
 *      实现 Runnable接口
 */
public class MyRunnable1 implements Runnable{
    //  整数修改的乐观锁： 原子类实现的
    private AtomicInteger count = new AtomicInteger();

    //  重写 run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Count ====> "+ count.incrementAndGet() );
        }
    }
}
