public class Main {
    public static void main(String[] args) {
        FibonacciSequence sequence = new FibonacciSequence(10);

        for (int number : sequence) {
            System.out.print(number + " ");
        }
    }
}