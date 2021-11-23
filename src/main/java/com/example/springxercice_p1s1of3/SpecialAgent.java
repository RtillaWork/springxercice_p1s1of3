package com.example.springxercice_p1s1of3;
// using javax.validation


import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.*;
import java.util.List;

public class SpecialAgent {

    @NotEmpty(message = "Not Empty")
    private String name;
    @NotBlank
    private String surname;
    @Size(min = 1, max = 3)
    private String code;
    @Size(max = 6)
    private List<String> cars;
    @NotNull
    private String status;
    @Min(value = 21, message = "Age must be greater than or equal to 21")  // @Max
    private int age;
    @Pattern(regexp = "[0-9]{1,3}")
    private String password;
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
