package blog.repo;

import blog.domain.Post;
import blog.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class PostRepoImpl implements PostRepo {
    private Map<Long, Post> posts = new HashMap<>();
    private AtomicLong nextId = new AtomicLong(1);

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(posts.values());
    }
    @Override
    public Post findById(long id) {
        return posts.get(id);
    }
    @Override
    public List<Post> findByAuthor(User author) {
        return posts.values().stream()
                .filter(post -> post.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    @Override
    public void save(Post post) {
        if (post.getId() == 0) {
            post.setId(nextId.getAndIncrement());
        }
        posts.put(post.getId(), post);
    }
}
