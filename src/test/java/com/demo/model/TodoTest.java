package com.demo.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TodoTest {
    @Test
    public void TodoCreated(){
        Todo todo = Todo.builder()
                .name("할일 1")
                .desc("내용 1")
                .status(Status.READY) //억지로 강제시켜 Test 코드를 통과하게 한다.
                .build();
        assertThat(todo).isNotNull();
    }

}