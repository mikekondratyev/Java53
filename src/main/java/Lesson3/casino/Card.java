package Lesson3.casino;

public class Card {
    private Rank rank;
    private Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

    public int getValue ()
    {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suite=" + suite +
                '}';
    }
}
