public class Computer {
    private String processor;
    private String RAM;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "processor: " + processor + ", ram: " + RAM + ", hard drive: " + hardDrive +
                ", graphics card: " + graphicsCard + ", operating system: " + operatingSystem;
    }
}