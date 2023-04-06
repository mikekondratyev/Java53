package Lesson4.animals;

public class BigDog  extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets (){
        System.out.println("Wooof");}
@Override
    public void greets (Dog dog) {
        System.out.println("Wooooof");}

    public void greets (BigDog bigDog) {
        System.out.println("Wooooooooof");

}
}
