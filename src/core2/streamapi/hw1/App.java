package core2.streamapi.hw1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу

 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям

 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 */

public class App {
    public static void main(String[] args) {

        /**
         * Дан список студентов с полями:
         * - Имя
         * - Фамилия
         * - Номер курса в университете
         * - Список оценок за учебу
         */
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Sidorov", 2, List.of(4.0, 5.0, 2.0, 3.0, 4.0)),
                new Student("Petr", "Markov", 3, List.of(5.0, 2.0, 4.0, 5.0, 4.0)),
                new Student("Maria", "Chechov", 4, List.of(3.0, 4.0, 5.0, 4.0, 3.0)),
                new Student("John", "Lennon", 5, List.of(3.0, 4.0, 4.0, 5.0, 5.0)),
                new Student("Mike", "Tyson", 2, List.of(3.0, 3.0, 4.0, 4.0, 5.0)),
                new Student("Kate", "Johnson", 3, List.of(5.0, 5.0, 4.0, 4.0, 4.0)));


        /**
         * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
         * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
         */
                Map<Integer, Double> task1 = students.stream()
                        .filter(s->s.getMarks().size()>3)
                        .collect(Collectors.groupingBy(Student::getCourse,  Collectors.averagingDouble(Student::getAverage)));

                System.out.println("-----------------------task1--------------------");
                task1.entrySet().forEach(System.out::println);

        /**
         * Список студентов данного курса, но только с полями Имя и Фамилия.
         * Список должен быть отсортированы по этим двум полям
         */
        List<Student> task2 = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .map(s -> new Student(s.getFirstName(), s.getLastName()))
                .collect(Collectors.toList());

        System.out.println("-----------------------task2--------------------");
        task2.forEach(System.out::println);
    }

}
