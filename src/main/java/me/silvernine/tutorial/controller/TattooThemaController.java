package me.silvernine.tutorial.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.silvernine.tutorial.domain.FeedListParam;
import me.silvernine.tutorial.dto.FeedListDto;
import me.silvernine.tutorial.dto.FeedTagDto;
import me.silvernine.tutorial.dto.TattooThemaDto;
import me.silvernine.tutorial.entity.FeedList;
import me.silvernine.tutorial.service.FeedListService;
import me.silvernine.tutorial.service.FeedTagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/feed")
public class TattooThemaController {
    private final FeedTagService feedTagService;

    public TattooThemaController(FeedTagService feedTagService) {
        this.feedTagService = feedTagService;
    }

    @Tag(name="[@tattoo_thema] 사용중인 타투테마 리스트 호출")
    @GetMapping("/tattoo_thema")
    public ResponseEntity<?> feedtag() throws Exception{
        List<TattooThemaDto> tattooThemaList = feedTagService.getTattooThemaList();

        List<HashMap<String, String>> themaList = new ArrayList<>();
        for(TattooThemaDto e : tattooThemaList) {
            HashMap<String, String> map1 = new HashMap<>();
            map1.put("en", e.getEn_thema_name());
            map1.put("ko", e.getKo_thema_name());
            themaList.add(map1);
            System.out.println(themaList);
        }

        return ResponseEntity.ok(themaList);
    }
}
