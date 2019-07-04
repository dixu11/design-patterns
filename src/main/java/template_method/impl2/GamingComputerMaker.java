package template_method.impl2;

public class GamingComputerMaker extends ComputerMaker {


    public GamingComputerMaker(Computer computer) {
        super(computer);
    }

    @Override
    public String getProcessor() {
        return "Intel Core i9-9900K";
    }

    @Override
    public String getMotherBoard() {
        return "Z390 Aorus Pro Wifi";
    }

    @Override
    public int getRam() {
        return 64;
    }

    @Override
    public boolean getIsSSD() {
        return true;
    }

    @Override
    public int getDiskSpace() {
        return 10_000;
    }

    @Override
    public String getOperationSystem() {
        return "windows 10";
    }
}
