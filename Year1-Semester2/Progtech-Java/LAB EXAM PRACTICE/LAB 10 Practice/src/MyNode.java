public class MyNode {
    private int data;
    private MyNode next;

    public MyNode(int data, MyNode next) {
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }
}
