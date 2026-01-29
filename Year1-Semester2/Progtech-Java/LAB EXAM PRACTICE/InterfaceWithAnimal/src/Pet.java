public abstract class Pet extends Animal{
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}