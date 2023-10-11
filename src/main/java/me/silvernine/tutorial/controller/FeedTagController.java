package me.silvernine.tutorial.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.silvernine.tutorial.domain.FeedListParam;
import me.silvernine.tutorial.dto.FeedListDto;
import me.silvernine.tutorial.dto.FeedTagDto;
import me.silvernine.tutorial.entity.FeedList;
import me.silvernine.tutorial.service.FeedListService;
import me.silvernine.tutorial.service.FeedTagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1/feed")
public class FeedTagController {
    private final FeedTagService feedTagService;

    public FeedTagController(FeedTagService feedTagService) {
        this.feedTagService = feedTagService;
    }

    @Tag(name="[@feedtag] 상위태그 12개 호출 API")
    @GetMapping("/feedtag")
    public ResponseEntity<?> feedtag() throws Exception{
        List<FeedTagDto> feedTagList = feedTagService.getFeedList();
        return ResponseEntity.ok(feedTagList);
    }
}
