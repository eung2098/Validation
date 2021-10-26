package com.example.filter.dto;

import lombok.*;

@Data              // getter/setter/toString 생성
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 전체생성자
public class User {

    private String name;
    private int age;

}
