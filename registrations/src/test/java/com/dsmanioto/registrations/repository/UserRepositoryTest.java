package com.dsmanioto.registrations.repository;

import com.dsmanioto.registrations.model.UserReg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@ActiveProfiles("local")
@SpringBootTest
public class UserRepositoryTest {

    private final UserRepository repository;

    @Autowired
    public UserRepositoryTest(UserRepository repository) {
        this.repository = repository;
    }

    @Test
    public void validateInsertUser() {
        UserReg user = createUser("danielsmanioto", "daniel");
        UserReg userSaved = repository.save(user);

        validateFields(user, userSaved);
    }

    @Test
    public void validateFindAllUsers() {
        repository.save(createUser("danielsmanioto", "daniel"));
        repository.save(createUser("carolsmanioto", "daniel"));
        repository.save(createUser("dsmanioto", "daniel"));
        List<UserReg> users = (List<UserReg>) repository.findAll();

        Assertions.assertEquals(3, users.size());
    }

    private void validateFields(UserReg user, UserReg userSaved) {
        Assertions.assertEquals(userSaved.getLogin(), user.getLogin());
        Assertions.assertEquals(userSaved.getAdmin(), user.getAdmin());
        Assertions.assertEquals(userSaved.getPassword(), user.getPassword());
    }

    private UserReg createUser(String login, String password) {
        return UserReg.builder()
                    .login(login)
                    .password(password)
                    .admin(true)
                    .build();
    }

}
