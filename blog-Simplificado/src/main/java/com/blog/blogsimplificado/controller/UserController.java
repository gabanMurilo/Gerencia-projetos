package com.blog.blogsimplificado.controller;

import blog.domain.User;
import blog.repo.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        userRepo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping ("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userRepo.findById(id);
        return ResponseEntity.ok(user);
    }
}
