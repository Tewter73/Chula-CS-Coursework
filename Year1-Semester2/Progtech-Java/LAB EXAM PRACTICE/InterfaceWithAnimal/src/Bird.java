public class Bird extends Pet implements Sing,Eat {
    public Bird(String name) {
        super(name);
    }

    public void move() {
        System.out.println(getName() + " flies");
    }

    @Override
    public void sing() {
        System.out.println(getName() + " sings bird's song");
    }

    @Override
    public void eat(Food prey) {
        System.out.println(getName() + " eats Pacific The Fish");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
