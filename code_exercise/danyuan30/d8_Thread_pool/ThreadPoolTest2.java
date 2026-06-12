package java_code.danyuan30.d8_Thread_pool;

import java.util.concurrent.*;


/**
 *        线 程 池 处 理  Runnable任务
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) {
//     1. 通过ThreadPoolExecutor创建一个线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable target = new MyRunnable();
        pool.execute(target);    // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);    // 复用前面的核心线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //  到了临时线程的创建时机了！（核心线程都在忙，任务队列都满了）
        pool.execute(target);
        pool.execute(target);
        //  到了新任务的拒绝时机了！
        pool.execute(target);


        pool.shutdown();    // 等待线程池的任务全部执行完毕后，再关闭线程池
//        pool.shutdownNow();    //  立即关闭线程池！不管任务是否执行完毕！（ 报 错 ）

    }
}


/*
        ExecutorService的常用方法：
                  1.  void  execute（Runnable command）   ->  执行Runnable任务
                  2.  Future<T>  submit（Callable<T> task）   ->  执行Callable任务，返回未来任务对象，用于获取线程返回的结果
                  3.  void  shutdown（）   ->  等全部任务执行完毕后，再关闭线程池
                  4.  List<Runnable>  shutdownNow（）   ->  立即关闭线程池，停止正在执行的任务，并返回队列中未执行的任务


         新任务的拒绝策略：
                  1. new ThreadPoolExecutor.AbortPolicy()     ->  丢弃任务并抛出RejectedExecutionException异常（默认的策略）
                  2. new ThreadPoolExecutor.DiscardPolicy()       ->  丢弃任务，但是不抛出异常（这是不推荐的做法）
                  3. new ThreadPoolExecutor.DiscardOldestPolicy()     ->  抛弃队列中等待最久的任务，然后把当前任务加入队列中
                  4. new ThreadPoolExecutor.CallerRunsPolicy()     ->  由主线程负责调用任务的run()方法从而绕过线程池直接执行（main主线程直接执行）
 */

