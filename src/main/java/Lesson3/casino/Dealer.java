package Lesson3.casino;

import java.util.Random;

public class Dealer {
    // генератор карт
    private Random r= new Random();
    public  Card getCard (){
        int suite = r.nextInt(4);
        int rank = r.nextInt(13);
        return new Card(
                Rank.values()[rank],
                Suite.values()[suite]
        );
    }
}
