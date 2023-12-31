package com.example.DoctorApp.model.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpOutput {
    private boolean signUpStatus;
    private String signUpStatusMessage;

}
