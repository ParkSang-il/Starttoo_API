package me.silvernine.tutorial.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedListParam {
    private String type;
    private String order;
    private int idx;
    private String name;
    private int like;
}