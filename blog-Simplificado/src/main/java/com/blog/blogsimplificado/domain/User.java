package com.blog.blogsimplificado.domain;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;

    private String nickname;

    public User(String name, String email, String password, String nickname) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }


    public void validate() {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nome do usuário é obrigatório");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email do usuário é obrigatório");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Senha do usuário é obrigatória");
        }
        if (nickname == null || nickname.isEmpty()) {
            throw new IllegalArgumentException("Nickname do usuário é obrigatório");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
