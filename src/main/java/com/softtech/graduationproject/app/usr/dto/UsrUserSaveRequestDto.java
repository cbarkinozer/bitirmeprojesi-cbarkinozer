package com.softtech.graduationproject.app.usr.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class UsrUserSaveRequestDto {

    private String name;
    private String surname;
    private String username;
    private String password;
}
