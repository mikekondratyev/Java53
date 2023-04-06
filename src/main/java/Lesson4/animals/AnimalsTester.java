package Lesson4.animals;

public class AnimalsTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.greets();

        Dog dog = new Dog ("Doggy");
        dog.greets();

        BigDog bigDog = new BigDog("Bigdoggy");
        bigDog.greets();
        bigDog.greets(bigDog);
        bigDog.greets(dog);
    }
}
