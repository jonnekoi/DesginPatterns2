public class GamingComputerBuilder implements ComputerBuilder {

    @Override
    public void buildProcessor() {
        System.out.println("Intel Core i9-14900K Processor");
    }

    @Override
    public void buildRAM() {
        System.out.println("32GB RAM");
    }

    @Override
    public void buildHardDrive() {
        System.out.println("2TB m2 ssd");
    }

    @Override
    public void buildGraphicsCard() {
        System.out.println("Nvidia RTX 4090");
    }

    @Override
    public void buildOperatingSystem() {
        System.out.println("Windows 11");
    }
}
