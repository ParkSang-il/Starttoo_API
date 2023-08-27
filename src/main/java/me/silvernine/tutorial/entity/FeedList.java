package me.silvernine.tutorial.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.w3c.dom.Text;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "`feed_list`")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedList {
    @Id
    @Column(name = "idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", columnDefinition = "TEXT")
    private String txt;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "img_path", length = 50)
    private String img;

    @Column(name = "like")
    private Integer like;

    @Column(name = "review")
    private Integer review;

    @Column(name = "reg_date")
    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime createdDate;
}
