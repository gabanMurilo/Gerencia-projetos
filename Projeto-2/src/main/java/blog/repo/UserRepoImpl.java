package blog.repo;
import blog.domain.User;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class UserRepoImpl implements UserRepo {
    private Map<Long, User> users = new HashMap<>();
    private AtomicLong nextId = new AtomicLong(1);

    @Override
    public User findById(Long id) {
        return users.get(id);
    }
    @Override
    public User findByNickname(String nickname) {
        return users.values().stream()
                .filter(user -> user.getNickname().equals(nickname))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(nextId.getAndIncrement());
        }
        users.put(user.getId(), user);
    }
}
