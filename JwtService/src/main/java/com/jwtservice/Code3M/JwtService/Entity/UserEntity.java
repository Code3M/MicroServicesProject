package com.jwtservice.Code3M.JwtService.Entity;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityScan
public class UserEntity {

    private String userID;
    private String password;
    private String userName;
}
