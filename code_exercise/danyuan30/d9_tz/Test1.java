package java_code.danyuan30.d9_tz;

public class Test1 {
    public static void main(String[] args) {
        //  目标：拓展悲观锁，乐观锁
        //  乐观锁：一开始不上锁，认为是没有问题的，大家一起跑，等要出现安全问题的时候才开始控制。     线程安全，性能较好！
        //      ->  原子类（Atomic）

        Runnable target = new MyRunnable1();

        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
        
    }
}
