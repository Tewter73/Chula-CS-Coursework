public class LinkedCollection implements Collection {
    private MyNode head;

    LinkedCollection() {
        this.head = null;
    }

    @Override
    public void add(int data) {
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void remove(int data) {
        MyNode current = head;
        MyNode previous = null;
        while (current != null) {
            if (current.data == data) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    @Override
    public boolean contain(int data) {
        MyNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int count = 0;
        MyNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void displayList() {
        MyNode current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}