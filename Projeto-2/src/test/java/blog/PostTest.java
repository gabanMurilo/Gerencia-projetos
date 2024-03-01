package blog;

import blog.domain.Post;
import org.junit.jupiter.api.Test;

public class PostTest {
    @Test
    public void testCreatePost() {
        Post post = new Post("titulo", "conteudo", null);
        post.validate();
    }
}
