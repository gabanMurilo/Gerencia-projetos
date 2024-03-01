package blog.useCase;

import blog.domain.Post;
import blog.repo.PostRepo;

import java.util.List;

public class ListAllPost_UseCase {
    private final PostRepo postRepo;
    public ListAllPost_UseCase(PostRepo postRepo) {
        this.postRepo = postRepo;
    }
    public List<Post> execute() {
        return postRepo.findAll();
    }
}
