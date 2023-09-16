package me.silvernine.tutorial.controller;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import me.silvernine.tutorial.domain.FeedListParam;
import me.silvernine.tutorial.service.FeedListService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final FeedListService feedListService;

    public UserController(FeedListService feedListService) {
        this.feedListService = feedListService;
    }

    @Tag(name="[@user] Like Interaction API")
    @PostMapping("/likeIt")
    public ResponseEntity<?> likeIt(FeedListParam feedListParam) throws Exception{
        // System.out.println(feedListParam.getLike());
        boolean likeIt = feedListService.setLikeIt(feedListParam);
        return ResponseEntity.ok(new HashMap<>(){{put("likeResult", likeIt);}});
    }
}