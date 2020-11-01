package org.upgrad.upstac.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.upgrad.upstac.users.models.Gender;
import org.upgrad.upstac.users.models.AccountStatus;
import org.upgrad.upstac.users.roles.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userName;

    @Column
    @JsonIgnore
    @ToString.Exclude
    private String password;

    private LocalDateTime created;

    public Long getId() {
        return id;
    }
//
//    public String getUserName() {
//        return userName;
//    }

//    public String getPassword() {
//        return password;
//    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public String getFirstName() {
        return firstName;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    private LocalDate dateOfBirth;


    private LocalDateTime updated;

    private String firstName;

    public Set<Role> getRoles() {
        return roles;
    }

    private AccountStatus status;

    @Column(unique = true)
    private String email;


    private String lastName;


    private Gender gender;

    @Column(unique = true)
    private String phoneNumber;
    private String address;

    private Integer pinCode;

    //CascadeType.PERSIST has issues with many to many which makes us not use CascadeType.ALL
    //So Using  other Cascades other than CascadeType.PERSIST
//    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
//    @JoinTable(name = "USER_ROLES", joinColumns = {
//            @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
//            @JoinColumn(name = "ROLE_ID") })
//    private Set<Role> roles;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;


    public boolean doesRoleIsDoctor() {

        return doesUserHasRole("DOCTOR");


    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean doesUserHasRole(String s) {
        return roles.stream()
                .filter(role -> {
                    return role.getName().equalsIgnoreCase(s);
                })
                .findFirst()
                .isPresent();
    }

    public boolean doesRoleIsUser() {
        return doesUserHasRole("USER");
    }

    public boolean doesRoleIsAuthority() {
        return doesUserHasRole("GOVERNMENT_AUTHORITY");
    }

    public boolean doesRoleIsTester() {
        return doesUserHasRole("TESTER");
    }

    public Integer getAge(){

        if(null != dateOfBirth)
            return LocalDate.now().getYear() - dateOfBirth.getYear();
        else
            return 0;
    }

    public void setUserName(String someuser) {
    }
}
