package Lesson4.animals;

public class Cat extends Animal {
    public String name;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");

    }
}
