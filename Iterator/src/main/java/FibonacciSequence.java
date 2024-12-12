import java.util.Iterator;

class FibonacciSequence implements Sequence, Iterable<Integer> {
    private final int limit;

    public FibonacciSequence(int limit) {
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(limit);
    }
}