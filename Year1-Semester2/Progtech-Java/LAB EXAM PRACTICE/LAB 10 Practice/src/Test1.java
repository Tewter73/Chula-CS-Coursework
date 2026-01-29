public class Test1 {
    public static void main(String[] args) {
        LinkedCollection list = new LinkedCollection();
        int obj1 = 20;
        int obj2 = 30;
        int obj3 = 50;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        System.out.println(list.size());
        list.remove(obj1);
        System.out.println(list.size());
        list.remove(obj3);
        System.out.println(list.size());
        System.out.println(list.contain(obj2));
        System.out.println(list.contain(obj3));
    }
}
