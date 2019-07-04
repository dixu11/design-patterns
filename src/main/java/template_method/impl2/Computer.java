package template_method.impl2;

public class Computer {
    private String processor;
    private String motherboard;
    private int ram;
    private boolean isSSD;
    private int diskSpace;
    private String operationSystem;

    public Computer setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Computer setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public Computer setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Computer setIsSSD(boolean isSSD) {
        this.isSSD = isSSD;
        return this;
    }

    public Computer setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
        return this;
    }

    public Computer setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", ram='" + ram + '\'' +
                ", isSSD='" + isSSD + '\'' +
                ", diskSpace='" + diskSpace + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
