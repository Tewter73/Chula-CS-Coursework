public class Test1 {
    public static void main(String[] args) {
        LinkedCollection linkedCollection = new LinkedCollection();

        linkedCollection.add(20);
        linkedCollection.add(30);
        linkedCollection.add(50);
        linkedCollection.displayList();
        System.out.println("Size of collection : " + linkedCollection.size());
        System.out.println("Is collection empty? : " + linkedCollection.isEmpty());
        System.out.println();

        linkedCollection.remove(20);
        linkedCollection.displayList();
        System.out.println("Size of collection : " + linkedCollection.size());
        System.out.println("Is collection empty? : " + linkedCollection.isEmpty());
        System.out.println();

        linkedCollection.remove(50);
        linkedCollection.displayList();
        System.out.println("Size of collection : " + linkedCollection.size());
        System.out.println("Is collection empty? : " + linkedCollection.isEmpty());
        System.out.println();

        System.out.println("Is 30 contains in collection? : " + linkedCollection.contain(30));
    }
}
