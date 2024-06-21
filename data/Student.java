package data;

import java.time.LocalDate;

// Класс студента, наследуется от пользователя и реализует Comparable
public class Student extends User implements Comparable<Student> {

    // Поле студенческого идентификатора
    private Long studentId;

    // Конструкторы
    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    // Геттеры и сеттеры
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }

    // Переопределение метода compareTo для сравнения по идентификатору студента
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
