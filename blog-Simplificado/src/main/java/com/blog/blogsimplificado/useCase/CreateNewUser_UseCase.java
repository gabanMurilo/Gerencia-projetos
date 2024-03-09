package com.blog.blogsimplificado.useCase;

import blog.domain.User;
import blog.repo.UserRepo;

public class CreateNewUser_UseCase {
    private final UserRepo userRepo;

    public CreateNewUser_UseCase(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void executar(User user) {
        userRepo.save(user);
    }
}
