package me.silvernine.tutorial.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.silvernine.tutorial.dto.FeedListDto;
import me.silvernine.tutorial.entity.FeedList;
import me.silvernine.tutorial.service.FeedListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FeedListController {
    private final FeedListService feedListService;

    public FeedListController(FeedListService feedListService) {
        this.feedListService = feedListService;
    }
    @Tag(name="[@feedlist] 피드 리스트 API")
    @GetMapping("/feedlist")
    public ResponseEntity<?> feedList() throws Exception{
        List<FeedListDto> feedList = feedListService.getFeedList();
        return ResponseEntity.ok(new HashMap<>(){{put("recommendList", feedList);}});
    }

    @Tag(name="[@feedlist] 피드 등록 테스트 API")
    @GetMapping("/insertFeed")
    public void insertFeed() throws Exception{
        feedListService.setFeedInsert();
    }
}
