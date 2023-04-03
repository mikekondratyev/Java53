package Lesson1;

public class DogTester {

}

class Dog {

    public static void main(String[] args) {
        Dog trezor = new Dog();
        trezor.setAge(23);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");
        System.out.println("trezor is " + trezor.getAge());
        trezor.bark();

        Dog eleonora = new Dog("Bolonka", "Eleonora", 3, "White");
        eleonora.bark();
        System.out.println("Age ist " + eleonora.getAge());
        System.out.println("Num of dogs " + numberOfDogs);
        Dog.hello();
    }

    // конструктор - нужен чтобы правильно инициализировать свойства экземпляра класса
//    public Dog(String dogBreed, String dogName, int dogAge, String dogColor) {
//        breed = dogBreed;
//        name = dogName;
//        age = dogAge;
//        color = dogColor;
//    }

    public Dog(String breed, String name, int age, String color) {

        // this текущий экземплар класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public static int numberOfDogs = 2;
    public static void hello() {
        System.out.println("Hello");
    }

    public Dog() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <30){
        this.age = age;}
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String breed;
    private String name;
    private int age;
    private String color;


    void bark() {
        System.out.println("Gawk" + name);
    }
}

