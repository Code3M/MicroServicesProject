package com.jwtservice.Code3M.JwtService.JwtAuth;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String userName;
    private String password;
}
