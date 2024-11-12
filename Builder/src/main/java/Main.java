public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingBuilder);
        director.constructComputer();
        Computer gamingComputer = gamingBuilder.getComputer();
        System.out.println("Gaming Computer: " + gamingComputer);

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director = new ComputerDirector(officeBuilder);
        director.constructComputer();
        Computer officeComputer = officeBuilder.getComputer();
        System.out.println("Office Computer: " + officeComputer);
    }
}