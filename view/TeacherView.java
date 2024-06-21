

import data.Teacher;
import data.User;

import java.util.List;

public class TeacherView {

    public void sendOnConsole(List<? extends User> users, String header) {
        System.out.println(header);
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println();
    }

    public void sendOnConsole(List<Teacher> all) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendOnConsole'");
    }
}