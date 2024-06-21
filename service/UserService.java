package service;

import java.time.LocalDate;
import java.util.List;

// Интерфейс для сервисов пользователей
public interface UserService<T> {
    // Метод получения всех пользователей
    List<T> getAll();

    // Метод создания пользователя
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
