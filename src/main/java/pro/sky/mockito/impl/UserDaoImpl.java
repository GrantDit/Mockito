package pro.sky.mockito.impl;

import pro.sky.mockito.DAO.UserDao;
import pro.sky.mockito.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> userList;
    //Создал лист пользователей;
    public UserDaoImpl() {
        this.userList = List.of(new User("Ksenya"), new User("Kirill"), new User("Dima"), new User("Nadya"), new User("Ioan"), new User("Fedor"));
    }
    //Создал метод для возврата пользователя по имени;
    @Override
    public User getUserByName(String userName) {
        return userList.stream().filter(user -> userName.equals(user.getName())).findAny().orElse(null);
    }
    //Создал метод для возврата списка пользователей;
    @Override
    public List<User> findAllUsers() {
        return userList;
    }
    //Метод для возврата истины.
    @Override
    public boolean checkUserExist(User user) {
        return userList.contains(user);
    }
}