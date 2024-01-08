package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.validation.PasswordValidator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@PasswordValidator(pass = "password",
        confPass = "confirmPassword",
        message = "The passwords do not match")
@Getter
@Setter
public class UserBindingModel {

    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3,max = 20, message = "Username length must be less than 20 characters")
    private String username;

    @NotBlank
    @Size(min = 3,max = 20, message = "Password length must be between 3 and 20 characters")
    private String password;

    @NotBlank
    @Size(min = 3,max = 20, message = "Password length must be between 3 and 20 characters")
    private String confirmPassword;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2,max = 15, message = "Name length must be between 2 and 15 characters")
    private String name;

    @NotBlank(message = "Surname cannot be blank")
    @Size(min = 3,max = 15, message = "Surname length must be between 3 and 15 characters")
    private String surname;

    @Email(message = "Please enter a valid email address")
    private String email;

    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "([ 0-9]){8,11}$", message = "Invalid phone number")
    @Size(max = 10 ,message = "Phone number should be maximum of 10 digits")
    private String phoneNumber;

    @NotBlank(message = "City cannot be blank")
    @Size(min = 3,max = 15, message = "City length must be between 3 and 15 characters")
    private String city;

    @NotBlank(message = "Address cannot be blank")
    @Size(min = 5,max = 100, message = "Address length must be between 5 and 100 characters")
    private String address;

}
