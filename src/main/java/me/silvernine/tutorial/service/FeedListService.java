package me.silvernine.tutorial.service;

import lombok.RequiredArgsConstructor;
import me.silvernine.tutorial.entity.FeedList;
import me.silvernine.tutorial.repository.FeedListRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedListService {

    private final FeedListRepository feedListRepository;

    public FeedListService(FeedListRepository feedListRepository) {
        this.feedListRepository = feedListRepository;
    }

    /**
     * 피드 리스트 정보 조회
     */
    public ArrayList<FeedList> getFeedList() throws Exception{
        ArrayList<FeedList> feedList = new ArrayList<>();
        feedListRepository.findAll().forEach(e->feedList.add(e));

        return feedList;
    }

}
