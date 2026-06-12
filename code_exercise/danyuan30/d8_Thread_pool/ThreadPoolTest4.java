package java_code.danyuan30.d8_Thread_pool;


import java.util.concurrent.*;

/**
 *         线 程 池 工 具 类 Executors
 */
public class ThreadPoolTest4 {
    public static void main(String[] args) throws Exception {
////     1. 通过ThreadPoolExecutor创建一个线程池对象
//        ExecutorService pool = new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.CallerRunsPolicy());

//        1. 通过 Executors创建一个线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(21);
        //  老师： 核心线程数量到底配置多少呢？
        //  计算密集型的任务： 核心线程数量 = CPU核数 + 1
        //  IO密集型的任务：  核心线程数量 = CPU核数 * 2

//        2. 使用线程池处理 Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));   // 复用核心线程

        System.out.println(f1.get());   //  get()方法：返回Callable接口中call方法返回的结果
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());


        pool.shutdown();    // 等待线程池的任务全部执行完毕后，再关闭线程池
//        pool.shutdownNow();    //  立即关闭线程池！不管任务是否执行完毕！

    }
}

/*
        Executors:  是一个线程池的工具类，提供了很多静态方法用于返回不同特点的线程池对象
            -> 注意： 这些方法的底层，都是通过线程池的实现类ThreadPoolExecutor创建的线程池对象


        Executors使用可能存在的陷阱：
            -> 大型并发系统环境中使用Executors如果不注意可能会出现系统风险
            -> 最好还是使用ThreadPoolExecutor创建线程池（可控性强）
 */


