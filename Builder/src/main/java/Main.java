public class Main {

    public static void main(String[] args) {
        System.out.println("Building Gaming Computer");
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector gamingComputerDirector = new ComputerDirector(gamingComputerBuilder);
        gamingComputerDirector.buildComputer();

        System.out.println("\nBuilding Office Computer");
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector officeComputerDirector = new ComputerDirector(officeComputerBuilder);
        officeComputerDirector.buildComputer();
    }
}
