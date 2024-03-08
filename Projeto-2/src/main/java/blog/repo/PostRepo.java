package blog.repo;

import blog.domain.Post;
import blog.domain.User;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();
    List<Post> findByAuthor(User author);
    Post findById(long id);
    void save(Post post);
}
