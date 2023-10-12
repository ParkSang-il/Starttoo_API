package me.silvernine.tutorial.repository;

import me.silvernine.tutorial.domain.FeedListParam;
import me.silvernine.tutorial.dto.FeedListDto;
import me.silvernine.tutorial.dto.FeedTagDto;
import me.silvernine.tutorial.dto.TattooThemaDto;
import me.silvernine.tutorial.entity.FeedList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface FeedTagRepository {
    @Select("select * from feed_tag")
    List<FeedTagDto> feedTag();

    @Select("SELECT * FROM tattoo_thema WHERE flag='1'")
    List<TattooThemaDto> tattooThema();
}
