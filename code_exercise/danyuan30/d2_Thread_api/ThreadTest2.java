package java_code.danyuan30.d2_Thread_api;

/**
 *    sleep方法  和  join方法
 */
public class ThreadTest2 {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            // 休眠 5秒
            if (i == 3){
                // 会让当前的线程暂停 5秒，再继续执行  （ 声明异常 ）
                Thread.sleep(5000);
            }
        }

        //   join方法的作用： 让当前的这个方法的线程先执行完
        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();

    }
}
