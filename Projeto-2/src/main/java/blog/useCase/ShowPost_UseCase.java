package blog.useCase;

import blog.repo.PostRepo;

public class ShowPost_UseCase {
    private final PostRepo postRepo;
    public ShowPost_UseCase(PostRepo postRepo) {
        this.postRepo = postRepo;
    }
    public void execute(Long id) {
        postRepo.findById(id);
    }
}
