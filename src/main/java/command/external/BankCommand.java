package command.external;

interface BankCommand extends Command {

    void execute();

    void undo();
}
