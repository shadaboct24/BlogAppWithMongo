package com.app.blogapplication.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Document(collection = "UserData")
@Data
public class User {

    @Id
    private String id;

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 50, message = "username must be between 3 to 50 characters")
    private String user_name;

    @NotBlank(message = "email required")
    @Email(message = " invalid email format")
    private String user_email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 40, message = "password should be min 6 characters")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$", message = "Password must contain")
    private String user_password;

    @Size(min = 30, max = 100, message = "About must be inbetween 30 to 100 characters")
    private String user_about;

}
