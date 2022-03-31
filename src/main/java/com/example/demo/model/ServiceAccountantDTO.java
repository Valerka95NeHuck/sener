package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceAccountantDTO {
    private long id;
    private Date date;
    private int time;
    private String task;
    private Long userId;

}
