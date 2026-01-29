public class LinkedCollection implements SortCollection {
    private MyNode start;
    public LinkedCollection() {
        start = null;
    }

    @Override
    public void add(int first) {
        MyNode newNode = new MyNode(first);
        if (start == null) {
            start = newNode;
        } else {
            MyNode currNode = start;
            MyNode preNode = null;
            int count = 0;
            while (currNode.getNext() != null && currNode.getFirst() < first) {
                preNode = currNode;
                currNode = currNode.getNext();
                count++;
            }
            if (start.getFirst() > first) {
                newNode.setNext(start);
                start = newNode;
            } else {
                if (currNode.getNext() == null && currNode.getFirst() < first) {
                    currNode.setNext(newNode);
                    count++;
                    System.out.println("count: " + count);
                }
                else {
                    if (currNode.getFirst() != first) {
                        newNode.setNext(currNode);
                        preNode.setNext(newNode);
                        System.out.println("count: " + count);
                    } else {
                        System.out.println(first + " has already existed in List");
                    }
                }
            }
        }
        printList();
    }

    @Override
    public void remove (int first) {
        MyNode curr = start;
        MyNode preNode = null;
        int count = 0;
        if (start.getFirst() != first) {
            while (curr != null && curr.getFirst() < first) {
                preNode = curr;
                curr = curr.getNext();
                count++;
            }
            if (curr == null || curr.getFirst() < first) {
                System.out.println("Not Found.");
            } else {
                if (start.getFirst() == first) {
                    start = start.getNext();
                } else {
                    preNode.setNext(curr.getNext());
                }
            }
        } else {
            start = start.getNext();
        }
        System.out.println("count: " + count);
        printList();
    }

    @Override
    public  boolean contain(int first) {
        MyNode curr = start;
        while (curr != null && first != curr.getFirst()) {
            curr = curr.getNext();
        }
        if (curr == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public int size() {
        MyNode curr = start;
        int count = 0;
        while (curr != null) {
            curr = curr.getNext();
            count++;
        }
        return count;
    }

    public void printList() {
        MyNode curr = start;
        while (curr != null) {
            System.out.print(curr.getFirst() + "\t");
            curr = curr.getNext();
        }
        System.out.println("\n-----------------------------------------------");
    }
}