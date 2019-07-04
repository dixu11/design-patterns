package command.external;

//wpłata
// cały koncept komendy ma reprezentować jedno wykonanie metody
public class DepositMoneyCommand implements BankCommand {
    private final BankAccount bankAccount;
    private final int moneyToDepisit;

    public DepositMoneyCommand(BankAccount bankAccount, int moneyToDepisit) {
        this.bankAccount = bankAccount;
        this.moneyToDepisit = moneyToDepisit;
    }

    @Override
    public void execute() {
        bankAccount.deposit(moneyToDepisit);
    }

    @Override
    public void undo() {
        bankAccount.withdraw(moneyToDepisit);
    }
}
