package template_method.impl2;

public class EcoComputerMaker  extends  ComputerMaker{
    public EcoComputerMaker(Computer computer) {
        super(computer);
    }

    @Override
    public String getProcessor() {
        return "Intel Celeron N3450 ";
    }

    @Override
    public String getMotherBoard() {
        return "intel compatible one";
    }

    @Override
    public int getRam() {
        return 4;
    }

    @Override
    public boolean getIsSSD() {
        return false;
    }

    @Override
    public int getDiskSpace() {
        return 32;
    }

    @Override
    public String getOperationSystem() {
        return "Windows 10";
    }

}
