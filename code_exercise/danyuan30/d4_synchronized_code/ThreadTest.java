package java_code.danyuan30.d4_synchronized_code;


/**
 *     线程同步（同步代码块） 解决 线程安全问题
 */
public class ThreadTest {
    public static void main(String[] args) {
        //  1. 创建一个账户对象，代表两个人的共享账户
        Account acc = new Account("ICDC-110",100000);

        //  2. 创建两个线程，分别代表小明，小红，再去同一个账户对象中取钱10万
        new DrawThread(acc,"小明").start();   // 小明
        new DrawThread(acc,"小红").start();  // 小红


        Account acc1 = new Account("ICDC-111",100000);
        new DrawThread(acc1,"小黑").start();   // 小黑
        new DrawThread(acc1,"小白").start();  // 小白

    }
}


/*
     同步代码块 ： 把访问共享资源的核心代码给上锁，以此保证线程的安全

           synchronized（同步锁）{
                   访问共享资源的核心代码
           }

     原理：每次只允许一个线程加锁后进入，执行完毕后自动解锁，其他线程才可以进来执行

     锁对象（同步锁）的使用规范：
            1. 建议使用共享资源作为锁对象，对于实例方法建议使用this作为锁对象
            2. 对于静态方法建议使用字节码（类名.class）对象作为锁对象
*/


/*
   同步锁的注意事项：
           对于当前同时执行的线程来说，同步锁必须是同一把（同一个对象），否则会出bug
 */
