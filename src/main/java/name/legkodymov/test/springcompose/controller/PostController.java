package name.legkodymov.test.springcompose.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import name.legkodymov.test.springcompose.model.Post;
import name.legkodymov.test.springcompose.repository.PostRepository;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    
    private final PostRepository repository;
    
    public PostController(PostRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Post> findAll() {
        return repository.findAll();
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Post createPost(@RequestBody Post post) {
        return repository.save(post);
    }
}