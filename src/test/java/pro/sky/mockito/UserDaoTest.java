package pro.sky.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pro.sky.mockito.impl.UserDaoImpl;
import pro.sky.mockito.model.User;

class UserDaoTest {
    private final UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test                                                               //Проверка на возврат пользователя из списка
    @DisplayName("Вернуть пользователя по имени")
    public void shouldReturnUserByName() {
        Assertions.assertEquals(new User("Kirill"), userDaoImpl.getUserByName("Kirill"),
                "Пользователь должен присутствовать в списке");
    }

    @Test
    @DisplayName("Возваращать не null,если пользователь есть в списке")  //Проверка на возврат Null если пользователь отсутсвует в списке.
    public void shouldReturnNotNullUserExist() {
        Assertions.assertEquals(userDaoImpl, "Ivan");
    }
}