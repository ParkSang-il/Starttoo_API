package me.silvernine.tutorial.repository;

import me.silvernine.tutorial.domain.FeedListParam;
import me.silvernine.tutorial.dto.FeedListDto;
import me.silvernine.tutorial.entity.FeedList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface FeedListRepository {
    // 아래 코드를 Repository에 추가

    // mapper를 호출하는 방식
    // void save1(FeedListDto memberMapperDTO);

    // mapper를 호출하지 않고 여기서 쿼리까지 수행하는 방식
    // 아래같이 코드를 작성하면 mapper에 내용을 추가하지 않아도 됨
    // 사용하고자 하는 쿼리 종류(insert, select 등)에 맞춰 어노테이션을 붙여야함
    @Insert("insert into feed_list(content, name, reg_date) values (#{content}, #{name}, NOW())")
    void feedSave(FeedListDto feedListMapperDto);

    @Select("select * from feed_list order by ${order} desc")
    List<FeedListDto> feedList(FeedListParam feedListParam);
    @Select("select * from feed_list")
    List<FeedListDto> feedList();

    @Update("update feed_list set `like` = `like` + 1 where `name` = #{name} and `idx` = #{idx}")
    void likeIt(FeedListDto likeItMapperDto);
}
