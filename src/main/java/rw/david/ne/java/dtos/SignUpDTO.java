package rw.david.ne.java.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rw.david.ne.java.enums.EGender;
import rw.david.ne.java.security.ValidPassword;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {

    @Email
    private  String email;

    @NotBlank
    private  String firstName;

    @NotBlank
    private  String lastName;

    @NotBlank
    @Pattern(regexp = "[0-9]{9,10}", message = "Your phone is not a valid tel we expect 07***")
    private  String mobile;

    private EGender gender;

    @Pattern(regexp = "[0-9]{16}")
    private String nationalId;

    @ValidPassword
    private  String password;
}
