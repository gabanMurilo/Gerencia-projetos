package blog.repo;

import blog.domain.User;

public interface UserRepo {
    User findById(Long id);
    void save(User user);
    User findByNickname(String nickname);
}
