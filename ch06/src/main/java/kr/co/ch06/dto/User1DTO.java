package kr.co.ch06.dto;


import kr.co.ch06.entity.User1;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User1DTO {
    private String usid;
    private String name;
    private String birth;
    private int age;

    // DTO 변환 메서드 정의
    public User1 toEntity(){
        return User1.builder()
                .usid(usid)
                .name(name)
                .birth(birth)
                .age(age)
                .build();
    }



}

