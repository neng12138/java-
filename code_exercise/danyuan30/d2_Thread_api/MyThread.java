package java_code.danyuan30.d2_Thread_api;

public class MyThread extends Thread{
    public MyThread(){}
    public MyThread(String name) {
        super(name);   //  为当前线程设置名字（调用 Thread类的构造方法）
    }

    @Override
    public void run() {
        //  哪个线程执行它，他就会得到哪个线程对象
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(t.getName()+"输出："+i);
        }
    }
}
