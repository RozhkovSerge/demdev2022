package core2.streamapi.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1. Дан список целых числе. Найти среднее всех нечетных чисел дедящихся на 5
 * 2. Дан список строк. Найти количество уникальных строк длиной более 8 символов
 */

public class Task {

    public static void main(String[] args) {
        getAverage();

        /**
         Дана Map<String, Integer>. Найти сумму всех значений длина ключей которых меньше 7 символов
         */
        int result = Map.of(
                        "string1", 2,
                        "strin2", 3,
                        "string3", 12,
                        "strin4", 10,
                        "strin5", 5,
                        "string6", 7)
                .entrySet()
                .stream()
                .filter(s -> s.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce(0, Integer::sum);

        int resultDenis = Map.of(
                        "string1", 2,
                        "strin2", 3,
                        "string3", 12,
                        "strin4", 10,
                        "strin5", 5,
                        "string6", 7)
                .entrySet()
                .stream()
                .filter(s -> s.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println("-------------------------");
        System.out.println(result);
        System.out.println(resultDenis);

        /**
         Дан список целых чисел, вывести строку представляющую собой конкатенацию этих чисел
         Пример: {5,2,4,1}
         Результат: "5241"
         **/

        System.out.println("---------------------------");
        String result2 = List.of(5, 2, 4, 1)
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(result2);

        /**
         Дан класс Person, вывести полное имя самомго старшего человека, длина полного имени которого не превышает 15 симвлово
         */

        System.out.println("--------last------------");
       List<Person> persons = List.of(
               new Person("Michel", "Lenon", 31),
                new Person("Ivan", "Petrov", 23),
                new Person("Mike", "Sidorov", 31),
                new Person("John", "Smirnov", 12),
                new Person("Mary", "Tyson", 56),
                new Person("Igor", "Kovalev", 15)
        );
             String name =  persons.stream()
               .filter(p -> p.getFullName().length()<15)
               .max(Comparator.comparing(Person::getAge))
               .map(Person::getFullName)
               .orElse(null);

        System.out.println(name);

        Map<Integer, List<Person>> map1 = persons
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));

        Map<Integer, List<String>> map2 = persons
                .stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getFullName, Collectors.toList())));

        map1.entrySet().forEach(System.out::println);

        map2.entrySet().forEach(System.out::println);
    }

    private static void getAverage() {
        OptionalDouble result = IntStream.range(1, 1000)
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .peek(value -> System.out.println(value + " : " + value / 5))
                .average();
        result.ifPresent(System.out::println);
    }


}
