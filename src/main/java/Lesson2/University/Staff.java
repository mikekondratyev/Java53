package Lesson2.University;

public class Staff extends Person{


    private int salary;

    private String faculty;

    public Staff(String name, int age, int salary, String faculty) {
        super(name, age);
        this.salary = salary;
        this.faculty = faculty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(getName() + salary);
    }
}
