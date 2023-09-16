package me.silvernine.tutorial.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedListDto {
    private Integer idx;
    private String content;
    private String name;
    private String img_path;
    private Integer like;
    private Integer review;

    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime reg_date;

    // 아래 생성자는 회원가입 때 필요한 정보만 모아놓은 생성자로 미리 만들어둡시다 :D
    public FeedListDto (String content, String name) {
        this.content = content;
        this.name = name;
    }

    public FeedListDto (int idx, String name) {
        this.idx = idx;
        this.name = name;
    }
}
