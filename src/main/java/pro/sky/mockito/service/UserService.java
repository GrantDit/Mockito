package pro.sky.mockito.service;

import pro.sky.mockito.model.User;

public interface UserService {
    boolean checkUserExist(User user);          //параметр для возврата истины
}
