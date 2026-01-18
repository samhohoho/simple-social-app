package com.samhoho.simple_social_app.controller;

import com.samhoho.simple_social_app.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    PostRepository postRepository;

    @PostMapping("/test-batch")
    public void testBatch(@RequestParam int total) {
        postRepository.testBatch(total);
    }
}
