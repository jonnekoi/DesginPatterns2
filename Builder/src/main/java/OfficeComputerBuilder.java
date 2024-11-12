public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Inter Celeron Processor");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("4GB RAM");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("250GB Hard Drive");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Graphics Card");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 10");
    }

    public Computer getComputer() {
        return this.computer;
    }
}