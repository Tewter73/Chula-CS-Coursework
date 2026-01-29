public class BinarySearchTree {
    private BTNode root;
    private int size;

    public BinarySearchTree() {
        size = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add (Object e) {
        if (e == null) {
            return;
        }
        BTNode pre = null;
        BTNode tmp = new BTNode(e,null,null);
        int value = (Integer) e;

        if (root == null) {
            root = tmp;
            size++;
        }
        else {
            BTNode start = root;
            while (start != null) {
                pre = start;
                int BTNode = (Integer)start.getData();
                if (BTNode == value) {
                    System.out.println("Object: " + e + " has existed in the tree.");
                    return;
                }
                else {
                    if (BTNode > value) {
                        start = start.getLeft();
                    } else {
                        start = start.getRight();
                    }
                }
            }
            int curNode = (Integer)pre.getData();
            if (curNode > value){
                pre.setLeft(tmp);
                size++;
            } else if (curNode < value) {
                pre.setRight(tmp);
                size++;
            }
        }
    }

    public boolean contain(Object e) {
        BTNode start = root;
        int value = (Integer) e;

        while (start != null) {
            int BTNode = (Integer)start.getData();
            if (BTNode == value) {
                return true;
            } else {
                if (BTNode > value) {
                    start = start.getLeft();
                } else {
                    start = start.getRight();
                }
            }
        }
        return false;
    }

    public Object getMax() {
        BTNode start = root;
        if (start == null) {
            return null;
        }
        while (start.getRight() != null) {
            start = start.getRight();
        }
        return start.getData();
    }



    private Object getMin(BTNode node) {
        Object minValue = node.getData();
        while (node.getLeft() != null) {
            minValue = node.getLeft().getData();
            node = node.getLeft();
        }
        return minValue;
    }

    public void printTree() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return;
        }
        System.out.println("Inorder");
        inOrder(root);
        System.out.println();
    }

    public void inOrder(BTNode r) {
        if (r != null) {
            inOrder(r.getLeft());
            System.out.print(r.getData() + "\t\t");
            inOrder(r.getRight());
        }
    }
}