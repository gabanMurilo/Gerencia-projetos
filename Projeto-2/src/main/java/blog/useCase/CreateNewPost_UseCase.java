package blog.useCase;

import blog.domain.Post;
import blog.repo.PostRepo;

public class CreateNewPost_UseCase {
    private final PostRepo postRepo;

    public CreateNewPost_UseCase(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public void execute(Post post) {
        postRepo.save(post);
    }
}
