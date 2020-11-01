package org.upgrad.upstac.testrequests;

import lombok.Data;
import org.upgrad.upstac.users.models.Gender;

import javax.validation.constraints.NotNull;

@Data

public class CreateTestRequest {



    private String name;
    private Gender gender;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }


    public Integer getPinCode() {
        return pinCode;
    }

    private String address;
    private Integer age;

    private String email;

    private String phoneNumber;


    private Integer pinCode;



    public void setAge(int i) {
    }

}
