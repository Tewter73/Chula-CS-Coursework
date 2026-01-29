public class Fish extends Pet implements Food{
    public Fish(String name) {
        super(name);
    }

    public void move() {
        System.out.println(getName() + " swims");
    }

    @Override
    public void isEaten(Eat predator) {
        System.out.println(getName() + " is eaten by " + ((Pet)predator).getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
