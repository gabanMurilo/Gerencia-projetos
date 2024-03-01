package blog.useCase;

import blog.domain.Post;
import blog.domain.User;
import blog.repo.PostRepo;

import java.util.List;

public class ListPostByUser_UseCase {
    private final PostRepo postRepo;

    public ListPostByUser_UseCase(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public List<Post> execute(User Author) {
        return postRepo.findByAuthor(Author);
    }
}
