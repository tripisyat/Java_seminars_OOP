public abstract class Animal {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void animalSleep(); // абстрактный метод
}
