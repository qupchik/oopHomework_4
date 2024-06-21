package service;

import data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Сервис для работы со студентами
public class StudentService implements UserService<Student> {

    // Список студентов
    private final List<Student> students;

    // Конструктор
    public StudentService() {
        this.students = new ArrayList<>();
    }

    // Метод получения всех студентов
    @Override
    public List<Student> getAll() {
        return students;
    }

    // Метод создания студента
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Student student : students) {
            if (student.getStudentId() > countMaxId) {
                countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}
