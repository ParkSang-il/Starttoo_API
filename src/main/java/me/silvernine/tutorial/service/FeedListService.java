package me.silvernine.tutorial.service;

import me.silvernine.tutorial.dto.FeedListDto;
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
    public ArrayList<FeedListDto> getFeedList() throws Exception{
        ArrayList<FeedListDto> feedList = new ArrayList<>();
        feedListRepository.feedList().forEach(e->feedList.add(e));

        return feedList;
    }

    /**
     * 피드 등록 테스트
     */
    public void setFeedInsert() throws Exception{
        feedListRepository.feedSave(new FeedListDto("mybatis컨텐츠 등록", "mybatis"));
    }

    /*
     * 좋아요 테스트
     */
    public boolean setLikeIt() throws Exception{
        feedListRepository.likeIt(new FeedListDto(1, "Startoo_official1"));
        return true;
    }
}
