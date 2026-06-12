package java_code.danyuan30.d1_Thread_create;


/**
 *     1. 让子类继承 Thread线程类
 */
public class MyThread extends Thread{
    //  2. 必须重写 Thread线程类的 run方法
    @Override
    public void run() {
        //  描述线程的执行任务
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程MyThread输出: "+ i);
        }

    }
}
