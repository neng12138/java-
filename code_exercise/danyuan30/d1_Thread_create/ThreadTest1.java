package java_code.danyuan30.d1_Thread_create;

/**
 *     多线程的创建方式 ： 继承 Thread线程类
 */

public class ThreadTest1 {
    //  main方法是由一条默认的主线程负责执行
    public static void main(String[] args) {
        //   3.  创建 MyThread线程类的对象代表一个线程
        Thread t = new MyThread();
        //   4.  启动线程 （自动执行run方法）
        t.start();


        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程main输出： "+ i);
        }

    }
}



/*
     优点 ： 编码简单
     缺点 ： 线程类已经继承Thread，无法继承其他的类，不利于功能的扩展
 */



/*
     多线程的注意事项 ：
          1.  启动线程必须是调用start方法，不是调用run方法
          2.  不要把主线程任务放在启动子线程之前
 */


