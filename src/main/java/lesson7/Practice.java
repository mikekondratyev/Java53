package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList(
                "Andorra", "Costa-Rica", "Salvador", "Chad", "South Korea"
        ));
        countries.add("Serbia");


        Filter fil = s -> s.toLowerCase().contains("s");
        System.out.println(filter (countries, fil));

    }

    interface Filter {
        public boolean filter(String s);
    }
    public static List<String> filter(List<String> s, Filter f){
        List<String> result = new ArrayList<>();
        for(String string :s)
            if(f.filter(string))
                result.add(string);
        return result;
    }
}
