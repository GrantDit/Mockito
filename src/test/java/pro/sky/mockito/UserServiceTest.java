package pro.sky.mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.mockito.DAO.UserDao;
import pro.sky.mockito.impl.UserServiceImpl;
import pro.sky.mockito.model.User;
import pro.sky.mockito.service.UserService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)         //Классу, который будет использовать Mockito, следует с помощью аннотации @ExtendWith подключить расширение от Mockito.
class UserServiceTest {
    User kirill = new User("Kirill");
    User tanya = new User("Tanya");
    @Mock
    private UserDao userDaoMock;
    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Test
    @DisplayName("Проверка,существует ли в списке")
    public void shouldCheckUserExist() {
        when(userDaoMock.checkUserExist(kirill)).thenReturn(true);
        Assertions.assertTrue(userServiceImpl.checkUserExist(kirill));
    }

    @Test
    @DisplayName("Проверка на то что пользователя нет в списке")
    public void shouldCheckUserNotExist() {
        when(userDaoMock.checkUserExist(tanya)).thenReturn(false);
        Assertions.assertFalse(userServiceImpl.checkUserExist(tanya));
    }
}