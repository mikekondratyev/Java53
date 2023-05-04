package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("France");
        countries.add("Germany");
        countries.add("Denmark");
        System.out.println(countries);
        countries.add(1, "Poland");
        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println(countries.get(3));
        countries.set(0, "Norway");
        //countries.add (8, "Andorra"); так нельзя
        countries.remove("Poland");
        countries.remove(0);
        System.out.println(countries.contains("Denmark"));
        System.out.println(countries);
        printStringsGreaterThan4(countries);

        List<String> names = Arrays.asList("Max", "Amalia", "Dina", "Sergey");

        System.out.println(

                compare(
                        Arrays.asList("Dima", "Max", "Sveta"),
                        Arrays.asList("Dima", "Anna", "Alina")
                )
        );
    }
    public static void printStringsGreaterThan4 (List<String> a){
        for (int i = 0; i < a.size(); i++) {
            if ((a.get(i).length()>7)){
                System.out.println(a.get(i));
            }
// countries.stream().filter(s -> s.length() > 5).forEach(System.out::println);
        }

    }
    List<String> names = Arrays.asList("Max", "Amalia", "Dina", "Sergey");
    // напишите функцию которая принимает на вход два списка строк одинаковой длины
    // и возвращает список Boolean - true если элементы с одним и тем-же индексом
    // попарно одинаковы и false наоборот
    // [Dima, Max, Sveta], [Dima, Anna, Alina] -> [true, false, false]
    public static List<Boolean> compare(List<String> a, List<String> b)
    {
        List <Boolean> r = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if ((a.get(i)).equals (b.get(i))) {
                r.add(true);
            } else {
                r.add(false);
                r.add(
                        a.get(i).equals(b.get(i))
                );
            }
        }

        return r;
    }

    }

