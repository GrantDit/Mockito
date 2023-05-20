package pro.sky.mockito.DAO;

import pro.sky.mockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();

    boolean checkUserExist(User user);
}
