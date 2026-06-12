package java_code.danyuan30.d5_synchronized_method;

public class DrawThread extends Thread{
    private final Account account;

    public DrawThread(Account acc, String name){
        super(name);
        this.account = acc;
    }

    @Override
    public void run() {
        // 取钱（小明，小红）
        account.drawMoney(100000);
    }
}
