package com.blog.blogsimplificado.controller;

import blog.domain.Post;
import blog.domain.User;
import blog.repo.PostRepo;
import blog.repo.UserRepo;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private PostRepo postRepo;
    private UserRepo userRepo;

    public PostController(PostRepo postRepo, UserRepo userRepo) {
        this.postRepo = postRepo;
        this.userRepo = userRepo;
    }

    @GetMapping
    public ResponseEntity<Void> CreatePost(@RequestBody Post post) {
        User author = userRepo.findByNickname(post.getAuthor().getNickname());
        if (author == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        post.setAuthor(author);
        postRepo.save(post);
        return new ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity<List<Post>> listPosts() {
        List<Post> posts = postRepo.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping ("/user/{nickname}")
    public ResponseEntity<List<Post>> listPostsByUser(@PathVariable String nickname) {
        User user = userRepo.findByNickname(nickname);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        List<Post> posts = postRepo.findByAuthor(user);
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
    @GetMapping ("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id) {
        Post post = postRepo.findById(id);
        if (post == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(post, HttpStatus.OK);
    }
}
