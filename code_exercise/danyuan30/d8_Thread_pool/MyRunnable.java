package java_code.danyuan30.d8_Thread_pool;


/**
 *      1. 让这个类实现 Runnable接口
 */
public class MyRunnable implements Runnable{
    //   2. 重写 run方法
    @Override
    public void run(){
        //  描述任务
        System.out.println(Thread.currentThread().getName()+" ===> 输出666~~~");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
