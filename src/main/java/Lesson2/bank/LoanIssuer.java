package Lesson2.bank;

public class LoanIssuer {
    private  String name;
    private boolean isLazy;
    private boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toIssue (LoanTaker taker) {
        if (isLazy && taker.getYearlyIncome>20000){
            return true;
        }
        if(!isLazy && isKind && taker.getYearlyIncome() > 25_000 && taker.getAge() < 60) {
            return true;
        }
        if(!isLazy && !isKind && taker.getYearlyIncome() > 28_000 && taker.getAge() < 50)
            return true;

        return false;
    }
    }



