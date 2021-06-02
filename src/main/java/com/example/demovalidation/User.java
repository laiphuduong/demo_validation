package com.example.demovalidation;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
@UserConstraint
public class User {
    private UUID id;
    private String userName;
    private String password;
    private Integer age;
}
