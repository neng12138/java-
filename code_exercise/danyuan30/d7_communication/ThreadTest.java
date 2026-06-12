package java_code.danyuan30.d7_communication;


/**
 *    目标 ： 了 解 一 下 线 程 通 信 （前提：线程安全）
 */
public class ThreadTest {
    public static void main(String[] args) {
        //  需求： 3个生产者线程负责生产包子，每个线程每次只能生产1个包子放在桌子上
        //        2个消费者线程负责吃包子，每人每次只能从桌子上拿一个包子吃
        //        5个人竞争同一张桌子
        Desk desk = new Desk();

        //  创建3个生产者线程（3个厨师）
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"厨师1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"厨师2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"厨师3").start();


        //  创建2个消费者线程（2个吃货）
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        },"吃货1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        },"吃货2").start();

    }
}

/*
        Object类的等待和唤醒方法：
             1. void wait() =>  让当前线程等待并释放所占锁，直到另一个线程调用 notify()方法或 notifyAll()方法
             2. void notify()  =>  唤醒正在等待的单个线程
             3. void notifyAll()  =>  唤醒正在等待的所有线程

        注意：上述方法应该使用当前同步锁对象（实例：this  静态：类名.class）进行调用,否则会出bug

 */


