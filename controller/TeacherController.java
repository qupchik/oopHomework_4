

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

import java.time.LocalDate;

// Контроллер для работы с учителями
public class TeacherController implements UserController<Teacher> {

    // Сервис для работы с данными о учителях
    private final TeacherService dataService = new TeacherService();
    // Представление для учителей
    private final TeacherView teacherView = new TeacherView();

    // Метод создания учителя
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
}
