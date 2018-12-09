package com.kpi;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String nickname;
    private Integer level;
}