package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int EMPTY = -1;
    private Node last;
    int i;// TODO: można usunąć i
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.value;

        last = last.prev;
        return ret;
    }
    static class Node {

        public final int value;
        public Node prev, next;

        public Node(int i) {
            value = i;
        }

    }
}
