import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Recommendation> recommendations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addBooks();

        while (true) {
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone List and add new book and target group");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("Recommendation: " + (i + 1) + ":");
                        Recommendation recommendation = recommendations.get(i);
                        System.out.println("Target Audience: " + recommendation.getTargetAudience());
                        for (Book book : recommendation.getBooks()) {
                            System.out.println("Book: " + book.getTitle() + " Author: " + book.getAuthor() + "Year: " + book.getPublicationYear() + " Genre: " + book.getGenre());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Select list to clone: ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();

                    Recommendation cloned = recommendations.get(index).clone();
                    System.out.print("Enter new target audience for cloned list: ");
                    cloned.setTargetAudience(scanner.nextLine());

                    System.out.print("Enter new book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter new book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter new book genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter new book publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    cloned.addBook(new Book(title, author, genre, year));
                    recommendations.add(cloned);
                    System.out.println("List cloned and new book added");
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void addBooks() {
        recommendations.add(new Recommendation("TArget group 1", new ArrayList<>(List.of(
                new Book("Book1", "Author1", "Genre1", 2000),
                new Book("Book2", "Author2", "Genre2", 2001),
                new Book("Book3", "Author3", "Genre3", 2002)
        ))));
    }
}