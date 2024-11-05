public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User User1 = new User("User1");
        User User2 = new User("User2");

        library.addUnprotectedDocument("document1", "UNPROTECTED.");

        library.addProtectedDocument("document2", "PROTECTED", "User1");

        try {
            System.out.println("User1 access to document1: " + library.getDocument("document1").getContent(User1));
            System.out.println("User2 accesses document1: " + library.getDocument("document1").getContent(User2));

            System.out.println("User1 accesses document2: " + library.getDocument("document2").getContent(User1));
            System.out.println("User2 accesses document2: " + library.getDocument("document2").getContent(User2));

        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
