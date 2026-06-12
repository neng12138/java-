package java_code.danyuan30.d1_Thread_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


/**
 *    多线程的创建方式 ： 实现 Callable接口
 */
public class ThreadTest3 {
    //  main方法是由一条默认的主线程负责执行
    public static void main(String[] args) throws Exception {
        //  3. 创建一个 Callable接口的对象
        Callable<String> callable = new MyCallable(100);
        //  4. 把 Callable对象封装成一个 FutureTask对象（任务类对象）
        /*
            未来任务对象的作用：
                1. 是一个任务对象，实现了 Runnable接口
                2. 可以在线程执行完毕之后，用未来任务对象调用 get方法获取线程执行完毕后的结果
         */
        FutureTask<String> futureTask = new FutureTask<>(callable);
        //  5. 将任务对象交给一个Thread对象（自动执行 call方法）
        new Thread(futureTask).start();

        // 6. 线程执行完毕后获取返回的结果 （get方法获取call方法返回的值）
        String rs = futureTask.get();
        System.out.println(rs);


        Callable<String> callable1 = new MyCallable(200);
        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        new Thread(futureTask1).start();

        String rs1 = futureTask1.get();
        System.out.println(rs1);

    }
}


/*
     优点 ：   线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强；
             可以在线程执行完毕后去获取线程执行的结果
     缺点 ： 编码复杂一点
 */


