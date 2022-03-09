package Lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Easy {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        Map<String, Integer> array = new HashMap<>();

        for (String i : words){
            if (array.containsKey(i)) {
                array.put(i, array.get(i) + 1);
            } else {
                array.put(i, 1);
            }
        }
        System.out.println(array);;

    }




}
