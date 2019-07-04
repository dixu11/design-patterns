package command.external;

//wypłata
public class WithdrawMoneyCommand implements BankCommand {

    private final BankAccount bankAccount;
    private final int moneyToWithdraw;

    public WithdrawMoneyCommand(BankAccount bankAccount, int moneyToDepisit) {
        this.bankAccount = bankAccount;
        this.moneyToWithdraw = moneyToDepisit;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(moneyToWithdraw);
    }

    @Override
    public void undo() {
        bankAccount.deposit(moneyToWithdraw);
    }
}
