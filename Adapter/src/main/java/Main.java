public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(1);
        date.setMonth(1);
        date.setYear(2024);

        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(15);

        System.out.println("New Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}