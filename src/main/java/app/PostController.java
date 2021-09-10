package app;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.model.Post;
import app.service.PostService;
import io.jooby.ModelAndView;
import io.jooby.annotations.*;
import lombok.extern.slf4j.Slf4j;

@Path("/")
@Controller
@Slf4j
public class PostController {

  private PostService postService;

  public PostController(@Autowired PostService postService) {
    this.postService = postService;
  }

  @GET
  public ModelAndView index() {
    return new ModelAndView("index.ftl")
      .put("name", "Jooby");
  }

  @GET("write")
  public String write() {
    Post post = new Post();
    post.setTitle("abcd");
    post.setContent("hahaghohohohohohoho!!!!");

    return postService.writePost(post).toString();
  }
}
