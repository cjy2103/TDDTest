package com.demo.model;

import lombok.*;

import java.time.LocalDateTime;

//Lombok
@Getter
@Setter
@NoArgsConstructor  // 기본 생성자
@Builder
@EqualsAndHashCode(of = "id") //객체가 서로 같은지 확인할때
@AllArgsConstructor // 모든 필드를 파라미터로 가지는 생성자를 만든다
public class Todo {
    private Integer id;
    private String name;
    private String desc;
    private Status status = Status.READY;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
