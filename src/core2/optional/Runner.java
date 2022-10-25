package core2.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        Stream.of(
                        new Student("Ivan", 24),
                        new Student("Tom", 43),
                        new Student("Bob", 21),
                        new Student("Mike", 56),
                        new Student("Nick", 32)
                )
                .parallel()
                .map(Student::getAge)
                .reduce(Integer::max)
                .ifPresent(System.out::println);


        Optional<Student> mayBeStudent = Stream.of(
                        new Student("Ivan", 24),
                        new Student("Tom", 43),
                        new Student("Bob", 21),
                        new Student("Mike", 56),
                        new Student("Nick", 32)
                )
                .filter(student -> student.getAge()<18)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);
        mayBeStudent.ifPresent(System.out::println);
    }
}
