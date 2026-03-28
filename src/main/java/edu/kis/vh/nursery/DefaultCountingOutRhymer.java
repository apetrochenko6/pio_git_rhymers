package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY = -1;
    public static final int  RETURN_VALUE= EMPTY;
    public static final int SIZE = 12;
    private int[] numbers  = new int[SIZE];

    private int total = EMPTY;
    public int getTotal() {
        return total;
    }
    public void countIn(int value) {
        if (!isFull())
            numbers[++total] = value;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
