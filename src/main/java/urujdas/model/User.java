package urujdas.model;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.time.LocalDateTime;

public class User {
    private final Long id;
    private final String username;
    private final String password;

    private final String firstname;
    private final String lastname;

    private final LocalDateTime birthDate;

    private final String email;

    private final Gender gender;

    private final String phone;

    @GeneratePojoBuilder
    User(Long id, String username, String password, String firstname, String lastname, LocalDateTime birthDate,
         String email, Gender gender, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }

    public Long getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (firstname != null ? !firstname.equals(user.firstname) : user.firstname != null) return false;
        if (lastname != null ? !lastname.equals(user.lastname) : user.lastname != null) return false;
        if (birthDate != null ? !birthDate.equals(user.birthDate) : user.birthDate != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (gender != user.gender) return false;
        return !(phone != null ? !phone.equals(user.phone) : user.phone != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static UserBuilder fromUser(User user) {
        return new UserBuilder()
                .withId(user.id)
                .withUsername(user.username)
                .withPassword(user.password)
                .withFirstname(user.firstname)
                .withLastname(user.lastname)
                .withBirthDate(user.birthDate)
                .withEmail(user.email)
                .withGender(user.gender)
                .withPhone(user.phone);
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}