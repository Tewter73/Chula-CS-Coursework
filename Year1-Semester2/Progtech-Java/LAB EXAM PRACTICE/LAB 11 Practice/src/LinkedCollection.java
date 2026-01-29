public class LinkedCollection implements SortCollection {
    private MyNode first;

    public LinkedCollection() {
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        int count = 0;
        MyNode currentNode = first;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            count++;
        }
        return count;
    }

    @Override
    public boolean contain(int data) {
        MyNode start = first;
        while (start != null && start.getData() != data) {
            int b = data;
            int a = start.getData();
            if (a > b) {
                return false;
            }
            start = start.getNext();
        }
        return start != null;
    }

    @Override
    public void add(int data) {
        if (contain(data)) {
            System.out.println(data + " has already existed in List.");
            return;
        } else {
            System.out.println("Add Value: " + data);
            if (isEmpty()) {
                first = new MyNode(data, null);
            } else {
                MyNode cur1 = first;
                MyNode cur2 = null;
                int a = cur1.getData();
                int v = data;
                if (a < v) {
                    first = new MyNode(data, first);
                } else {
                    while (cur1 != null && a < v) {
                        cur2 = cur1;
                        cur1 = cur1.getNext();
                        if (cur1 != null) {
                            a = cur1.getData();
                        }
                    }
                    MyNode tmp = new MyNode(data, cur1);
                    if (cur2 == null) {
                        first = tmp;
                    } else {
                        cur2.setNext(tmp);
                    }
                }
            }
        }
    }

    @Override
    public void remove(int data) {
        MyNode currentNode = first;
        MyNode previousNode = null;

        // หาโหนดที่มีค่าเท่ากับ data
        while (currentNode != null && currentNode.getData() != data) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        // ถ้าไม่พบข้อมูลที่ต้องการลบ
        if (currentNode == null) {
            System.out.println("No " + data + " In Collection");
            return;
        }

        // ถ้าโหนดที่ต้องการลบเป็นโหนดแรกของลิงก์ลิสต์
        if (previousNode == null) {
            first = first.getNext();
        } else {
            // ลบโหนดที่ต้องการ
            previousNode.setNext(currentNode.getNext());
        }

        // พิมพ์ลิสต์หลังจากการลบ
        printList();
    }

    public void printList() {
        MyNode start = first;
        while (start != null) {
            System.out.print(start.getData() + "\t");
            start = start.getNext();
        }
        System.out.println();
    }
}
