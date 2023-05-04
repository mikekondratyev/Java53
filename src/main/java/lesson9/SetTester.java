package lesson9;

import java.util.*;

public class SetTester {

    public static void main(String[] args) {

        Set<String> groups = new HashSet<>();

        groups.add("Abba");
        groups.add("Guns and Roses");
        groups.add("Pearl Jam");
        groups.add("Abba");
        groups.add("Beatles");

        System.out.println(groups);
        for (String g:groups)
              {
                  System.out.println("group: "+g);
        }

        //groups.size
        TreeSet<String> groupsTree = new TreeSet<>(groups);
        System.out.println(groupsTree);
        System.out.println(groups.contains("A"));

        Set <String> slice = groupsTree.subSet("C", "R");
        System.out.println(slice);

        // groupsTree.floor("C") все что меньше
        // groupsTree.ceiling("G") все что больше

        Set<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Abba");
        names.add("Kristina");
// groups.addAll(names) // сложение

        // groups.removeAll(names) // вычитание

        // groups.containsAll(names) // находятся ли все элементы сета в другом

        // groups.retainAll(names) // общие элементы сетов
        System.out.println(
                letters("hello lake mid")
        );

        System.out.println(
                getDoubles("dima max sveta max lena gena lena sveta max")
        );

    }

    // напишите функцию которая возвращает набор уникальных букв из строки
    public static Set<String> letters(String s)
    {
        // "hello lake mid" -> h e l a k m d
        // до 21:26
        // s.split("")
      String [] letters = s.split("");
        Set<String> ret = new HashSet<>();
        ret.addAll(Arrays.asList(letters));
        return ret;
    }

    // напишите функцию которая возвращает список дубликатов из строки
    // "dima max sveta max lena gena lena sveta max" -> [max sveta lena]
    public static Set<String> getDoubles(String s)
    {
        // s.split(" ")
        Set<String> doubles = new HashSet<>(); // дубликаты
        Set<String> words = new HashSet<>(); // слова
       // String [] letters = s.split("");
        for (String w:s.split("")){
            if (words.contains(w))
                doubles.add(w);
            words.add(w);
        }

        // до 21:45
        // words.contains("max") ?
        return doubles;
    }

}