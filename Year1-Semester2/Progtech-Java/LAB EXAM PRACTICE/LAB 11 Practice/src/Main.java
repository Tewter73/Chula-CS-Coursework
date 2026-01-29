public class Main {
    public static void main(String[] args) {
        LinkedCollection  col = new LinkedCollection();
        System.out.println("Add Value: 20");
        col.add(20);
        System.out.println("Add Value: 30");
        col.add(30);
        System.out.println("Add Value: 15");
        col.add(15);
        System.out.println("Add Value: 25");
        col.add(25);
        col.add(30);
        System.out.println("Add Value: 40");
        col.add(40);
        System.out.println("Is 30 in the List?");
        System.out.println(col.contain(30));
        System.out.println("Is 28 in the List?");
        System.out.println(col.contain(28));
        System.out.println("Remove Value: 15");
        col.remove(15);
        System.out.println("Remove Value: 25");
        col.remove(25);
        System.out.println("Remove Value 40");
        col.remove(40);
        System.out.println("Remove Value: 35");
        col.remove(35);
    }
}