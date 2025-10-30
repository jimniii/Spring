package kr.co.ch03.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder // 초기화 할 때 Builder로 초기화함

public class UserDTO {

        private String uid;
        private String name;
        private String birth;
        private int age;








}
