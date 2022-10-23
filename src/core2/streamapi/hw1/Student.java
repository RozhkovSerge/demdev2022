package core2.streamapi.hw1;

import java.util.List;
import java.util.OptionalDouble;

public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private List<Double> marks;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int course, List<Double> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.marks = marks;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public OptionalDouble getAverage() {
        return marks.stream()
                .mapToDouble(Double::intValue)
                .average();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
