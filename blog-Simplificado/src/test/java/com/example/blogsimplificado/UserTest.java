package com.example.blogsimplificado;

import blog.domain.User;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testCreateUser() {
        User user = new User("nometeste", "emailteste", "senhateste", "nicknameteste");
        user.validate();
    }

}
