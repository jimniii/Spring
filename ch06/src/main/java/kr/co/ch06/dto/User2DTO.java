package kr.co.ch06.dto;

import kr.co.ch06.entity.User2;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User2DTO {
    private String userid;
    private String name;
    private String birth;
    private int age;

    public User2 toEntity() {
        return User2.builder()
                .userid(userid)
                .name(name)
                .birth(birth)
                .age(age)
                .build();
    }
}
