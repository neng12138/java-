package java_code.danyuan30.d6_synchronize_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardid;   // 卡号
    private double money;   // 余额
    //  创建了一个 Lock锁对象
    private final Lock lk = new ReentrantLock();

    public Account() {
    }

    public Account(String cardid, double money) {
        this.cardid = cardid;
        this.money = money;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 小明，小红同时过来的
    public void drawMoney(double money) {
        // 谁来取钱？
        String name = Thread.currentThread().getName();
        try {
            lk.lock();   // 加锁
            // 1. 判断余额是否足够
            if (this.money >= money){
                System.out.println(name+"来取钱"+money+"成功！");
                this.money -= money;
                System.out.println(name+"来取钱后，余额剩余："+this.money);
            }else {
                System.out.println(name+"来取钱：余额不足~");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();  // 解锁
        }

    }
}


//         Lock锁： 1. 因为Lock锁的对象一般是不能修改的，因此常用 final（常量）定义Lock锁对象

//                 2. 如果Lock锁对象开锁后代码报错，Lock锁对象就不能执行解锁操作，因此要把 unlock放在 finally中
//                         -> try / finally  或  try / catch / finally


