public class Worm extends Animal implements Food {
    @Override
    public void move() {
        System.out.println("Worm crawls");
    }
    @Override
    public void isEaten(Eat predator) {
        System.out.println("Worm is eaten by " + ((Pet)predator).getName());
    }
}