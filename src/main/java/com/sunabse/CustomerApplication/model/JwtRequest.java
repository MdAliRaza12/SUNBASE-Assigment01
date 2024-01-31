package com.sunabse.CustomerApplication.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class JwtRequest {
    private String email;
    private String password;
}
