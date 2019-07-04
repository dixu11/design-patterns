package command.external;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        DepositMoneyCommand wplacam = new DepositMoneyCommand(bankAccount, 5000);
        wplacam.execute();
        System.out.println(bankAccount.getBalance());
        BankCommand dajMieKase = new WithdrawMoneyCommand(bankAccount,500);
        dajMieKase.execute();
        System.out.println(bankAccount.getBalance());
    }
}
