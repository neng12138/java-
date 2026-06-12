package java_code.danyuan30.d9_tz;

public class Test {
    public static void main(String[] args) {
        //  目标：拓展悲观锁，乐观锁
        //  悲观锁：一上来就上锁，没有安全感，每次只能一个线程进入访问完毕后，再解锁。       线程安全，性能较好！
        //      ->  同步代码块 ， 同步方法 ， Lock锁

        Runnable target = new MyRunnable();

        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }

    }
}
