package template_method.impl2;

public abstract class ComputerMaker {

    public ComputerMaker(Computer computer) {
        this.computer = computer;
    }

    private Computer computer;

    public final Computer build() {
        computer.setMotherboard(getMotherBoard());
        computer.setProcessor(getProcessor());
        computer.setRam(getRam());
        computer.setIsSSD(getIsSSD());
        computer.setDiskSpace(getDiskSpace());
        computer.setOperationSystem(getOperationSystem());

        return computer;
    }

    public abstract String getProcessor();
    public abstract String getMotherBoard();
    public abstract int getRam();
    public abstract boolean getIsSSD();
    public abstract int getDiskSpace();
    public abstract String getOperationSystem();

    public Computer getComputer() {
        return computer;
    }
}
