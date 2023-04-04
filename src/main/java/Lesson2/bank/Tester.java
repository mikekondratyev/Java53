package Lesson2.bank;

public class Tester {
    public static void main(String[] args) {
LoanTaker misha = new LoanTaker("Misha", 21000, 73);
        LoanIssuer dina = new LoanIssuer("Dina", true, false);
        System.out.println(dina.toIssue(misha));

        LoanIssuer foma = new LoanIssuer("Foma", false, false);
        LoanTaker alex  = new LoanTaker("Alex", 26_000, 30);
        System.out.println(foma.toIssue(alex));

        Account a1 = new Account("123", "Misha Semenov", 30);
        Account a2 = new Account("456", "Sergey Petrov", 45);
        a1.transfer(a2, 15);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
    }

