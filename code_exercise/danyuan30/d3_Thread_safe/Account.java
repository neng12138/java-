package java_code.danyuan30.d3_Thread_safe;

public class Account {
    private String cardid;   // 卡号
    private double money;   // 余额

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
        // 1. 判断余额是否足够
        if (this.money >= money){
            System.out.println(name+"来取钱"+money+"成功！");
            this.money -= money;
            System.out.println(name+"来取钱后，余额剩余："+this.money);
        }else {
            System.out.println(name+"来取钱：余额不足~");
        }

    }
}
