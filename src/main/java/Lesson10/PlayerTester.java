package Lesson10;

import java.util.HashSet;
import java.util.Iterator;

public class PlayerTester {
    public static void main(String[] args) {
        HashSet <Player> players = new HashSet<>();
        players.add (new Player(11,"Mike"));
        players.add (new Player(12,"Misha"));
        players.add (new Player(11,"Galina"));
        System.out.println(players);
        System.out.println(players.size());

// 8 распечатать всех игроков через итератор
        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext())
            System.out.println(playerIterator.next());

        for (Player p:players)
              {
            System.out.println("for each "+p);
        }
    }
}
