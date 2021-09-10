package app.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import app.model.Post;
import app.repository.PostRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostService {

    @Inject
    private PostRepository postRepository;

    public Post writePost(Post post) {
        postRepository.save(post);
        return post;
    }
}
