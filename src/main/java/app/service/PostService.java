package app.service;

import org.springframework.stereotype.Service;

import app.model.Post;
import app.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {

    private final PostRepository postRepository;

    public Post writePost(Post post) {
        postRepository.save(post);
        return post;
    }
}
