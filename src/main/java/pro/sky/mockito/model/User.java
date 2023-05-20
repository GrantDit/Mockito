package pro.sky.mockito.model;

import java.util.Objects;

public class User {
    public String name;                             //Создал обязательное поле;

    //Создал конструктор с параметром name;
    public User(String name) {
        this.name = name;
    }

    //Getters and Setters для параметра name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
