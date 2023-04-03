package Lesson2.University;

public class Uni {
    public static void main(String[] args) {
        Student max = new Student("max", 20, 2, "Music");
        Student margareth = new Student("margareth", 21, 3, "PolSci");

        Staff alex = new Staff("lex", 43, 50000, "Math");
        Person [] people = new Person[10];
        people[0] = max;
        people [1] = alex;
        people[2] = margareth;
         int sumAge=0;
        for (int i = 0; i < 2; i++) {

            if(people[i] != null)
                sumAge += people[i].getAge();
            people [i].introduce();

        }
        System.out.println(sumAge);
    }
}
