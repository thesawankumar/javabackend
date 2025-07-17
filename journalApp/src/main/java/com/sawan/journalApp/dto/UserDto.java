package com.sawan.journalApp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotNull
    private String userName;
    private String email;
    private boolean sentimentAnalysis;
    @NotNull
    private String password;
}
