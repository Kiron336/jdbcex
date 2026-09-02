package com.example.jdbcex.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@ToString
public class TodoVO {

    private Long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;
}
