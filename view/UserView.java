package view;

import data.User;

import java.util.List;

// Интерфейс представления для пользователей
public interface UserView<T extends User> {
    // Метод отправки списка пользователей на консоль
    void sendOnConsole(List<T> list);
}

