package org.xproce.mapperclass.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class UserDto {
    private String login;
    private String name;
}
