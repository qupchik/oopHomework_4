package data;

import java.util.List;

// Класс группы студентов, реализует Iterable
public class StudentGroup implements Iterable<Student> {
    // Список студентов
    private List<Student> students;
    // Учитель группы
    private Teacher teacher;

    // Конструктор
    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    // Геттеры и сеттеры
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    // Переопределение метода iterator для итерации по студентам группы
    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}