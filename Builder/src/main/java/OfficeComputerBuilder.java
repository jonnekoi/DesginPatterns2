public class OfficeComputerBuilder implements ComputerBuilder {
    @Override
    public void buildProcessor() {
        System.out.println("Inter Celeron Processor");
    }

    @Override
    public void buildRAM() {
        System.out.println("4GB RAM");
    }

    @Override
    public void buildHardDrive() {
        System.out.println("250GB Hard Drive");
    }

    @Override
    public void buildGraphicsCard() {
        System.out.println("Integrated Graphics Card");
    }

    @Override
    public void buildOperatingSystem() {
        System.out.println("Windows 10");
    }
}
