package Lesson1.Japanese;



public class JapaneseEmployee {
    private String firstName;
    private String lastName;
    private double baseSalary;
    private int years;

    public static int delta = 10000;

    public int calcSalary ()
    {
     baseSalary = baseSalary + delta * years;
     return (int) baseSalary;
    }

    public JapaneseEmployee(String firstName, String lastName, double baseSalary, int years) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.years = years;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void  hello () {
    if (years>10)   {
        System.out.println("Guten Tag "+ firstName + " " + lastName);

    }else{
        System.out.println("Hallo "+ firstName);
    }
    }

    public static void main(String[] args) {
         JapaneseEmployee mitsu = new JapaneseEmployee("Mitsuo", "Baso", 120000, 4);
        JapaneseEmployee akira  = new JapaneseEmployee("Akir", "Kura", 100000, 12);
        System.out.println(akira.getFirstName() + " " + akira.calcSalary());
        System.out.println(mitsu.getFirstName() + " " +  mitsu.calcSalary());
akira.hello();
mitsu.hello();
    }


}