package me.silvernine.tutorial.service;

import me.silvernine.tutorial.dto.FeedTagDto;
import me.silvernine.tutorial.dto.TattooThemaDto;
import me.silvernine.tutorial.repository.FeedTagRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedTagService {

    private final FeedTagRepository feedTagRepository;

    public FeedTagService(FeedTagRepository feedTagRepository) {
        this.feedTagRepository = feedTagRepository;
    }

    /**
     * 태그 상위 12개 호출
     */
    public ArrayList<FeedTagDto> getFeedList() throws Exception{

        ArrayList<FeedTagDto> feedTagList = new ArrayList<>();
        feedTagRepository.feedTag().forEach(e->feedTagList.add(e));

        return feedTagList;
    }

    /**
     * 사용중인 타투테마 호출
     */
    public ArrayList<TattooThemaDto> getTattooThemaList() throws Exception{

        ArrayList<TattooThemaDto> tattooThemaList = new ArrayList<>();
        feedTagRepository.tattooThema().forEach(e->tattooThemaList.add(e));

        return tattooThemaList;
    }

}
