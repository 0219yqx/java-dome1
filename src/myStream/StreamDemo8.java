package myStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> male = new ArrayList<>();
        ArrayList<String> female = new ArrayList<>();
        Collections.addAll(male, "John,23", "Mike,22", "Tom,24", "Jak,25", "Jack,26");
        Collections.addAll(female, "Mary,21", "Jane,20", "Lily,22", "Lucy,23", "Linda,24");
        List<String> maleList = male.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).toList();
        List<String> femaleList = female.stream().filter(s -> s.split(",")[0].charAt(0) == 'L').skip(1).toList();
        List<Text.Actor> actor=Stream.concat(maleList.stream(), femaleList.stream())
                .map(s -> {
                    String[] parts = s.split(",");
                    return new Text.Actor(parts[0], Integer.parseInt(parts[1]));
                })
                .collect(Collectors.toList());

        System.out.println(actor);
    }
}