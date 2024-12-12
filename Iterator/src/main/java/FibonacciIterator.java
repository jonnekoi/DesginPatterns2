import java.util.Iterator;

class FibonacciIterator implements Iterator<Integer> {
    private int prev1 = 1;
    private int prev2 = 1;
    private int count = 0;
    private final int limit;

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        if (count == 0 || count == 1) {
            count++;
            return 1;
        }
        int next = prev1 + prev2;
        prev2 = prev1;
        prev1 = next;
        count++;
        return next;
    }
}