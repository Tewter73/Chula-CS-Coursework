public class AnimalTester {
    public static void main(String[] args) {
        Animal[] Animals = new Animal[3];
        Animals[0] = new Bird("Rio The Bird");
        Animals[1] = new Fish("Pacific The Fish");
        Animals[2] = new Worm();
        for (Animal a : Animals) {
            System.out.println("==========");
            a.move();
            if (a instanceof Sing) {
                ((Sing) a).sing();
            }
            if (a instanceof Eat)
                for (Animal a2 : Animals)
                    if (a2 instanceof Food) {
                        ((Eat) a).eat((Food) a2);
                        ((Food) a2).isEaten((Eat) a);
                    }
        }
    }
}
