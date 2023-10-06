package Lesson5.HW5_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple",
                "window",
                "pen",
                "book"
        );

        List<String> collect = strings.stream().sorted(String::compareTo).toList();

        System.out.println(collect);

        List<String> list = strings.stream().filter(a -> a.length() >= 4).toList();
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(2, 45, 56, 4, 6, 7, 12, 8, 78, 45, 32, 89, 20, 40, 60);
        List<Integer> sorted = numbers.stream().sorted().toList();
        System.out.println(sorted);

        List<Integer> list1 = numbers.stream().filter(a -> a % 3 == 0).toList();
        System.out.println(list1);
        List<Integer> list2 = numbers.stream().filter(a -> a % 10 == 0).toList();
        System.out.println(list2);

        numbers.stream().forEach(System.out::println);

        List<Integer> list3 = numbers.stream().map(a -> a * 3).toList();
        System.out.println(list3);


    }
}
