package Lesson2.bank;

public class Account {
    private String id;
    private String owner;
    private int balance;
    private int account;

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;


    }

    // добавление денег на счет
    // и возвращение полученного баланса
    public int debit (int money){
        // добавление денег на счет
        // и возвращение полученного баланса
        if (money<0){
            System.out.println("Unable");

        }else {
        balance = balance+ money;
        }
        return balance;
    }
    public int credit (int money){
        // удаление денег со счета
        // нельзя удалить больше чем на счете есть
        // при пытытке удалить больше, не нужно менять баланс счета, но нужно
        // печатать об этом сообщение
        // возвращается количество денег оставшихся на балансе
       if (balance-money<0){
           System.out.println("Unable");
           return 0;
       }
       balance-=money;
       return balance;
    }

    public int transfer (Account account, int amount){
        // перевод денег со счета на счет
        // кредитуем свой счет и дебитуем account
        // возвращается баланс счета
        // при попытке снять больше чем есть на счете нужно печатать сообщение

        if (balance<amount){
            System.out.println("Unable");
            return 0;
        }
        balance = balance-account.getBalance();
        account.balance = account.balance+ amount;
     return balance;
    }
}
