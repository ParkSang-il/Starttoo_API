package me.silvernine.tutorial.service;

import me.silvernine.tutorial.domain.FeedListParam;
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
    public ArrayList<FeedListDto> getFeedList(FeedListParam feedListParam) throws Exception{
        ArrayList<FeedListDto> feedList = new ArrayList<>();

        String order = feedListParam.getOrder();
        feedListParam.setOrder("reg_date");
        if (order != "1") {
            feedListParam.setOrder("`like`");
        }

        feedListRepository.feedList(feedListParam).forEach(e->feedList.add(e));

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
    public boolean setLikeIt(FeedListParam feedListParam) throws Exception{
        System.out.println(feedListParam.getLike());
        if(feedListParam.getLike() == 1){
            feedListRepository.likeIt(new FeedListDto(feedListParam.getIdx(), feedListParam.getName()));
        }else{
            feedListRepository.unLikeIt(new FeedListDto(feedListParam.getIdx(), feedListParam.getName()));
        }
        return true;
    }
}
