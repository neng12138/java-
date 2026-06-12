package java_code.danyuan30.d1_Thread_create;


/**
 *   1. 定义一个任务类，实现 Runnable接口
 */
public class MyRunnable implements Runnable{
    //  2. 重写 Runnable的 run方法
    @Override
    public void run() {
        // 线程要执行的任务
        for (int i = 1; i <= 3; i++) {
            System.out.println("子线程输出 ===》 "+i);
        }
    }
}
