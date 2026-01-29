public class MyNode {
    private int first;
    private MyNode next;

    public MyNode(int f) {
        first = f;
        next = null;
    }

    public void setFirst(int f) {
        first = f;
    }

    public void setNext(MyNode n) {
        next = n;
    }

    public int getFirst() {
        return first;
    }

    public MyNode getNext() {
        return next;
    }
}
