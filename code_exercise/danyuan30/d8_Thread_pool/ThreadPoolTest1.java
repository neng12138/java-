package java_code.danyuan30.d8_Thread_pool;


import java.util.concurrent.*;

/**
 *    线 程 池（ExecutorService） 的 创 建 :  ThreadPoolExecutor（实现类）
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
//     1. 通过ThreadPoolExecutor创建一个线程池对象
       /* public ThreadPoolExecutor(int corePoolSize,
                                  int maximumPoolSize,
                                  long keepAliveTime,
                                  TimeUnit unit,
                                  BlockingQueue<Runnable> workQueue,
                                  ThreadFactory threadFactory,
                                  RejectedExecutionHandler handler )*/

        ExecutorService pool = new ThreadPoolExecutor(3,5,8,TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

    }
}

/*
       ThreadPoolExecutor构造器：
            public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,
                                  long keepAliveTime,TimeUnit unit,
                                  BlockingQueue<Runnable> workQueue,
                                  ThreadFactory threadFactory,
                                  RejectedExecutionHandler handler )
        =>  参数1 ： corePoolSize : 指定线程池的核心线程的数量。
        =>  参数2 ： maximumPoolSize : 指定线程池的最大线程数量。
        =>  参数3 ： keepAliveTime : 指定临时线程的存活时间 。
        =>  参数4 ： unit  :  指定临时线程存活的时间单位（秒，分，时，天）。
        =>  参数5 ： workQueue : 指定线程池的任务队列。
                                -> new ArrayBlockingQueue<>()
                                -> new LinkedBlockingQueue<>()
        =>  参数6 ： threadFactory : 指定线程池的线程工厂。
                                    -> Executor.defaultThreadFactory()
        =>  参数7 ： handler : 指定线程池的任务拒绝策略（新任务来了该线程都在忙，任务队列也满了的时候，怎么处理）


        线程池的注意事项：
              1. 临时线程什么时候创建？
                    新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程

              2. 什么时候会开始拒绝新任务？
                    核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始拒绝任务

 */



