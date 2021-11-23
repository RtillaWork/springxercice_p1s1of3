package com.example.springxercice_p1s1of3;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserProfile {

    @NotNull(message = "Login must be not null.")
    @Size(min = 3, message = "Login must contain at least three characters.")
    private String login;

    @NotNull(message = "Password must be not null.")
    @Size(min = 5, message = "Password must contain at least five characters.")
    private String password;

    @NotNull(message = "Email must be not null.")
    @Email(message = "Email is invalid.")
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
