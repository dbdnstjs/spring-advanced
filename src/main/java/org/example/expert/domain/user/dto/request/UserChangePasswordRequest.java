package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {
    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";

    @NotBlank
    @Pattern(regexp = PASSWORD_REGEX)
    private String oldPassword;

    @NotBlank
    @Pattern(regexp = PASSWORD_REGEX)
    private String newPassword;
}
