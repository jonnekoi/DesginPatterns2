public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i9-14900K Processor");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("32GB RAM");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("2TB m2 ssd");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Nvidia RTX 4090");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11");
    }

    public Computer getComputer() {
        return this.computer;
    }
}