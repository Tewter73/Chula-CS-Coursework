public class LinkedCollection implements Collection {
    public MyNode first;
    private int size;

    public LinkedCollection() {
        first = null;
        size = 0;
    }

    @Override
    public void add(int data) {
        MyNode a = new MyNode(data, null);
        if (first == null) {
            first = a;
        } else {
            MyNode start = first;
            while (start.getNext() != null) {
                start = start.getNext();
            }
            start.setNext(a);
        }
        size++;
    }

    @Override
    public void remove(int data) {
        if (isEmpty()) {
            return;
        }
        MyNode pre = first;
        MyNode start = first;
        while (start.getNext() != null && start.getData() != data) {
            pre = start;
            start = start.getNext();
        }

        if (start.getData() != data) {
            System.out.println("ไม่พบข้อมูลที่ต้องการลบ");
        } else {
            if (start == first) {
                first = first.getNext();
            } else {
                pre.setNext(start.getNext());
                size--;
            }
        }
    }

    @Override
    public boolean contain(int data) {
        MyNode start = first;
        while (start != null && start.getData() != data) {
            start = start.getNext();
        }
        return start != null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }
}
