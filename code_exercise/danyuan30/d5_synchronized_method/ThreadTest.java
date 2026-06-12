package java_code.danyuan30.d5_synchronized_method;


/**
 *     线程同步（同步方法） 解决 线程安全问题
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
     同步方法 ： 把访问共享资源的核心方法给上锁，以此保证线程的安全

           修饰符 synchronized 返回值类型 方法名（形参列表）{
                   操作共享资源的代码
           }

     原理：每次只允许一个线程加锁后进入方法，执行完毕后自动解锁，其他线程才可以进来执行

     同步方法底层原理：
            1. 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码
            2. 如果方法是实例方法：同步方法默认用 this 作为锁对象
            3. 如果方法是静态方法：同步方法默认用 类名.class 作为锁对象
*/

