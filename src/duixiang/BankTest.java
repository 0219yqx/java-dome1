package duixiang;

public class BankTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount("1234567","张三", 1000.0,"储蓄账户");
        BankAccount account2 = new BankAccount("1234568","李四", 2000.0,"支票账户");
        System.out.println("\n显示=============");
        account.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("\n存款款=============");
        account.deposit(500);
        boolean flag = account.withdraw(2000);


    }

}
