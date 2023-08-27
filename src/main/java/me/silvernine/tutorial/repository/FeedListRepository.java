package me.silvernine.tutorial.repository;

import me.silvernine.tutorial.entity.FeedList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedListRepository extends JpaRepository<FeedList, Long> {

}
