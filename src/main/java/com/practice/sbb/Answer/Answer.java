package com.practice.sbb.Answer;

import com.practice.sbb.Question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity // answer 테이블
public class Answer {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime createDate;


    // Many = Answer, One = Question
    // 필수
    @ManyToOne
    private Question question;
}
