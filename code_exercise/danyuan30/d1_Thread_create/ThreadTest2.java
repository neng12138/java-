package java_code.danyuan30.d1_Thread_create;


/**
 *     多线程的创建方式 ： 实现 Runnable接口
 */
public class ThreadTest2 {
    //  main方法是由一条默认的主线程负责执行
    public static void main(String[] args) {
        //  3. 创建任务类对象
        Runnable target = new MyRunnable();
        //  4. 把任务类的对象交给一个线程对象处理
        new Thread(target).start();


        //  匿名内部类写法 ：
        Runnable target1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("子线程1输出 ===》 "+i);
                }
            }
        };
        new Thread(target1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("子线程2输出 ===》 "+i);
                }
            }
        }).start();


        //  lambda表达式 ：
        new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("子线程3输出 ===》 "+i);
            }
        }).start();


        for (int i = 1; i <= 3; i++) {
            System.out.println("主线程main输出 ===> "+i);
        }

    }
}



/*
     优点 ： 任务类只是实现接口，可以继续继承其他类，实现其他接口，扩展性强
     缺点 ： 需要多一个任务类对象
 */




