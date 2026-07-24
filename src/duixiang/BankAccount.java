package duixiang;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance; // 余额
    private String accountType;

    // ============== 构造方法 ==============
    public BankAccount() {
        // 无参构造，设置默认值
        this.accountNumber = "未设置";
        this.ownerName = "未知用户";
        this.balance = 0.0;
        this.accountType = "储蓄账户";
    }

    public BankAccount(String accountNumber, String ownerName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // ============== getter和setter方法 ==============
    /**
     * 获取账户号
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置账户号
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        // 验证账户号格式（假设需要10位数字）
        if (accountNumber != null && accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("账户号必须是10位数字！");
        }
    }

    /**
     * 获取户主姓名
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * 设置户主姓名
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        // 验证姓名不能为空
        if (ownerName != null && !ownerName.trim().isEmpty()) {
            this.ownerName = ownerName.trim();
        } else {
            System.out.println("户主姓名不能为空！");
        }
    }

    /**
     * 获取余额
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置余额（通常不直接提供，但根据你的要求保留）
     * @param balance
     */
    public void setBalance(double balance) {
        // 验证余额不能为负数
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("余额不能为负数！");
        }
    }

    /**
     * 获取账户类型
     * @return accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型
     * @param accountType
     */
    public void setAccountType(String accountType) {
        // 验证账户类型只能是储蓄账户或支票账户
        if ("储蓄账户".equals(accountType) || "支票账户".equals(accountType)) {
            this.accountType = accountType;
        } else {
            System.out.println("账户类型只能是'储蓄账户'或'支票账户'！");
        }
    }

    // ============== 业务方法 ==============

    /**
     * 存款方法
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("存款金额必须大于0");
        } else {
            this.balance += amount;
            System.out.println("成功存入，存入金额为" + amount + "元");
            System.out.println("存款成功，当前余额为：" + this.balance);
        }
    }

    /**
     * 取款方法
     * @param amount 取款金额
     * @return 取款是否成功
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额必须大于0！");
            return false;
        }

        if (amount > this.balance) {
            System.out.println("余额不足！当前余额：" + this.balance + "元");
            System.out.println("取款失败！");
            return false;
        }

        this.balance -= amount;
        System.out.println("成功取出 " + amount + " 元");
        System.out.println("剩余余额：" + this.balance + " 元");
        return true;
    }

    /**
     * 转账方法
     * @param targetAccount 目标账户
     * @param amount 转账金额
     * @return 转账是否成功
     */
    public boolean transferTo(BankAccount targetAccount, double amount) {
        // 验证目标账户
        if (targetAccount == null) {
            System.out.println("目标账户不存在！");
            return false;
        }

        // 验证不能给自己转账
        if (targetAccount == this) {
            System.out.println("不能给自己转账！");
            return false;
        }

        System.out.println(this.ownerName + " 向 " + targetAccount.getOwnerName() + " 转账 " + amount + " 元");

        // 先尝试从当前账户取款
        boolean withdrawSuccess = this.withdraw(amount);

        // 如果取款成功，向目标账户存款
        if (withdrawSuccess) {
            targetAccount.deposit(amount);
            System.out.println("✓ 转账成功！");
            System.out.println(this.ownerName + " 余额：" + this.balance + "元");
            System.out.println(targetAccount.getOwnerName() + " 余额：" + targetAccount.getBalance() + "元");
            return true;
        } else {
            System.out.println("✗ 转账失败！");
            return false;
        }
    }

    /**
     * 显示账户信息
     */
    public void displayAccountInfo() {
        System.out.println("========================");
        System.out.println("账户号：" + this.accountNumber);
        System.out.println("户主：" + this.ownerName);
        System.out.println("账户类型：" + this.accountType);
        System.out.printf("余额：%.2f 元\n", this.balance);
        System.out.println("========================");
    }

    /**
     * toString方法
     */
    public String toString() {
        return "BankAccount{accountNumber = " + accountNumber +
               ", ownerName = " + ownerName +
               ", balance = " + String.format("%.2f", balance) +
               ", accountType = " + accountType + "}";
    }
}