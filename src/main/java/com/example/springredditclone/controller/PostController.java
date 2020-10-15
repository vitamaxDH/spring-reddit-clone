package com.example.springredditclone.controller;

import com.example.springredditclone.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@AllArgsConstructor
public class PostController {

    private final PostService postService;

//    @PostMapping
//    public ResponseEntity createPost(@RequestBody PostRequest postRequest){
//        postService.save(postRequest);
//        return new ResponseEntity(HttpStatus.CREATED);
//    }
//
//    @GetMapping("/{id}")
//    public PostResponse getPost(@PathVariable Long id){
//        return postService.getPost(id);
//    }
//
//    @GetMapping("/by-subreddit/{id}")
//    public List<PostResponse> getPostBySubreddit(@PathVariable Long id){
//        return postService.getPostsBySubreddit(id);
//    }
//
//    @GetMapping("/by-user/{name}")
//    public List<PostResponse> getPostsByUsername(@PathVariable String username){
//        return postService.getPostsByUsername(username);
//    }
}
