package com.kpi;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class User {
    private String name;
    private String nickname;
    private Integer level;
}
