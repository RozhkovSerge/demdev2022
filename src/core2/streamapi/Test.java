package core2.streamapi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<String> strings = List.of("11", "22", "33", "44", "55", "66", "77", "88", "99");
        int min = strings.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .mapToInt(Integer::intValue)// из объекта в примитив
//                .mapToObj(Integer::valueOf) // из примитива в объект
                .summaryStatistics()
                .getMin();

        System.out.println(min);

        List<String> list = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9")
                .peek(System.out::println)
                .map(Integer::valueOf)
                .map(val -> val * 2)
                .peek(System.out::println)
                .map(value -> value.toString())
                .collect(Collectors.toList());
        System.out.println(list);

        IntStream.of(1, 2, 3).forEach(System.out::println);
        IntStream.iterate(0, value -> value + 3)
                .limit(10)
                .forEach(System.out::println);
    }
}
