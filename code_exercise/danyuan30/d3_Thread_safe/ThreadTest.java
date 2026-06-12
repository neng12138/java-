package java_code.danyuan30.d3_Thread_safe;


/**
 *     模拟线程安全问题
 */
public class ThreadTest {
    public static void main(String[] args) {
        //  1. 创建一个账户对象，代表两个人的共享账户
        Account acc = new Account("ICDC-110",100000);

        //  2. 创建两个线程，分别代表小明，小红，再去同一个账户对象中取钱10万
        new DrawThread(acc,"小明").start();   // 小明
        new DrawThread(acc,"小红").start();  // 小红


    }
}


/*
     线程安全问题发生的原因：
           多个线程，同时访问同一个共享资源，且存在修改此资源
 */
