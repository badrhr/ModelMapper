package org.xproce.mapperclass.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class UserDtoNew {

    private String login;
    private String name;
    private String password;
}
