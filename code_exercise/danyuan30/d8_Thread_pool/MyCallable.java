package java_code.danyuan30.d8_Thread_pool;

import java.util.concurrent.Callable;

/**
 *    1. 让这个类实现 Callable接口
 */
public class MyCallable implements Callable<String> {
    private final int n;
    public MyCallable(int n){
        this.n = n;
    }

    //   2. 重写 call方法
    @Override
    public String call() throws Exception  {
        //  描述线程的任务，返回线程执行返回后的结果

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return  Thread.currentThread().getName()+"线程求出1-"+n+"的和是： "+sum;
    }
}
