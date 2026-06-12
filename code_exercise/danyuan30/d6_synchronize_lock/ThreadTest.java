package java_code.danyuan30.d6_synchronize_lock;


/**
 *     线程同步（Lock锁） 解决 线程安全问题
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
     Lock锁 ： => 它可以创建出锁对象进行加锁和解锁，更灵活，更方便，更强大
              => Lock锁是接口，不能实例化，可以采用它的实现类ReentrantLock来构建Lock锁对象

     Lock锁的常用方法：
            1. void  lock()    =>    获得锁
            2. void  unlock()    =>   释放锁
*/

