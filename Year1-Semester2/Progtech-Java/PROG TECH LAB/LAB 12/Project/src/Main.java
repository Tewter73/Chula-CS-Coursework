public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(9);
        bst.add(2);
        bst.add(12);
        bst.add(1);
        bst.add(5);
        bst.add(10);
        bst.add(15);

        bst.printTree();

        System.out.println("nnodes: " + bst.nnodes());

        System.out.println("Max: " + bst.getMax());

        System.out.println("Is 12 in the tree?\t\t" + bst.contain(12));

        System.out.println("Is 20 in the tree?\t\t" + bst.contain(20));

        bst.remove(5);

        bst.printTree();
    }
}