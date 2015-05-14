package urujdas.web.user.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import net.karneim.pojobuilder.GeneratePojoBuilder;
import urujdas.model.Gender;
import urujdas.web.common.model.RegisterUserRequestBuilder;

import java.time.LocalDateTime;

public class RegisterUserRequest {

    @NotNull
    private final String username;

    @NotNull
    private final String password;

    private final String firstname;
    private final String lastname;

    private final LocalDateTime birthDate;

    private final String email;

    private final Gender gender;

    private final String phone;

    @GeneratePojoBuilder
    @JsonCreator
    public RegisterUserRequest(@JsonProperty("username") String username,
                               @JsonProperty("password") String password,
                               @JsonProperty("firstname") String firstname,
                               @JsonProperty("lastname") String lastname,
                               @JsonProperty("birthDate") LocalDateTime birthDate,
                               @JsonProperty("email") String email,
                               @JsonProperty("gender") Gender gender,
                               @JsonProperty("phone") String phone) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public static RegisterUserRequestBuilder builder() {
        return new RegisterUserRequestBuilder();
    }
}
