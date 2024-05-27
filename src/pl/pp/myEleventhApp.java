package pl.pp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private final String indexNumber;
    private final String firstName;
    private final String lastName;
    private final List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}

public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Find student with the highest average grade
        Student highestAverageStudent = students.getFirst();
        for (Student student : students) {
            if (student.calculateAverageGrade() > highestAverageStudent.calculateAverageGrade()) {
                highestAverageStudent = student;
            }
        }

        // Calculate average grade of all students
        for (Student student : students) {
            student.calculateAverageGrade();
        }

        // Output results
        System.out.println("Student with the highest average:");
        System.out.println(highestAverageStudent.getFirstName() + " " + highestAverageStudent.getLastName() +
                "(" + highestAverageStudent.getIndexNumber() + ")" + "-Average:" + highestAverageStudent.calculateAverageGrade());

        // Sort students by last names
        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("Students sorted by last names:");
        for (Student student : students) {
            System.out.println(student.getFirstName() + student.getLastName() +
                    "(" + student.getIndexNumber() + ")" + "-Average:" + student.calculateAverageGrade());
        }
    }
}

