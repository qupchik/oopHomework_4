import data.Student;
import data.Teacher;
import service.StudentGroupService;
import service.StudentService;
import service.TeacherService;
import view.TeacherView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем сервисы
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        StudentGroupService studentGroupService = new StudentGroupService();
        TeacherView teacherView = new TeacherView();

        // Создаем учителей
        teacherService.create("Иван", "Иванов", "Иванович", LocalDate.of(1980, 5, 15));
        teacherService.create("Петр", "Петров", "Петрович", LocalDate.of(1975, 8, 25));
        teacherService.create("Анна", "Сидорова", "Ивановна", LocalDate.of(1985, 3, 10));
        teacherService.create("Мария", "Павлова", "Сергеевна", LocalDate.of(1970, 10, 5));
        teacherService.create("Сергей", "Смирнов", "Александрович", LocalDate.of(1990, 12, 20));

        // Создаем студентов
        studentService.create("Петр", "Петров", "Петрович", LocalDate.of(2000, 3, 10));
        studentService.create("Анна", "Сидорова", "Ивановна", LocalDate.of(2001, 8, 20));
        studentService.create("Мария", "Иванова", "Петровна", LocalDate.of(1999, 12, 5));
        studentService.create("Иван", "Смирнов", "Алексеевич", LocalDate.of(2002, 6, 15));
        studentService.create("Елена", "Козлова", "Андреевна", LocalDate.of(2000, 9, 20));

        // Получаем списки студентов и учителей
        List<Student> students = studentService.getAll();
        List<Teacher> teachers = teacherService.getAll();

        // Создаем группы студентов для каждого учителя
        List<Student> group1Students = new ArrayList<>();
        group1Students.add(students.get(0));
        group1Students.add(students.get(1));
        group1Students.add(students.get(2));
        studentGroupService.createStudentGroup(teachers.get(0), group1Students);

        List<Student> group2Students = new ArrayList<>();
        group2Students.add(students.get(3));
        group2Students.add(students.get(4));
        studentGroupService.createStudentGroup(teachers.get(1), group2Students);

        // Выводим информацию о группах студентов
        System.out.println("Информация о учителях и группах студентов:\n");
        Teacher teacher1 = teachers.get(0);
        teacherView.sendOnConsole(studentGroupService.getStudentGroup().getStudents(),
                "Группа учителя " + teacher1.getFirstName() + " " + teacher1.getSecondName() + ":");

        Teacher teacher2 = teachers.get(1);
        teacherView.sendOnConsole(studentGroupService.getStudentGroup().getStudents(),
                "Группа учителя " + teacher2.getFirstName() + " " + teacher2.getSecondName() + ":");

        // Выводим информацию о всех учителях
        teacherView.sendOnConsole(teacherService.getAll(), "Список всех учителей:");

    }
}
