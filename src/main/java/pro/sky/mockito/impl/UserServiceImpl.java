package pro.sky.mockito.impl;

import pro.sky.mockito.DAO.UserDao;
import pro.sky.mockito.model.User;
import pro.sky.mockito.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.checkUserExist(user);
    }
}
