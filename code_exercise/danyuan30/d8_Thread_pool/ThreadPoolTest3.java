package java_code.danyuan30.d8_Thread_pool;

import java.util.concurrent.*;


/**
 *    线程池处理 Callable任务
 */
public class ThreadPoolTest3 {
    public static void main(String[] args) throws Exception {
//     1. 通过ThreadPoolExecutor创建一个线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

//        2. 使用线程池处理 Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));   // 复用核心线程

        System.out.println(f1.get());     //  get()方法：返回Callable接口中call方法返回的结果
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());


        pool.shutdown();    // 等待线程池的任务全部执行完毕后，再关闭线程池
//        pool.shutdownNow();    //  立即关闭线程池！不管任务是否执行完毕！

    }
}
