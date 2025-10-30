package kr.co.ch06.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.ch06.dto.User2DTO;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "User2")
public class User2 {

    @Id
    private String userid;
    private String name;
    private String birth;
    private int age;

    public User2DTO toDTO() {
        return User2DTO.builder()
                .userid(userid)
                .name(name)
                .birth(birth)
                .age(age)
                .build();
    }
}
