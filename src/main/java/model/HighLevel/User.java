package model.HighLevel;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity (name= "USERS")
public class User implements Serializable {

    private String login;
    private String password;
    private int userType; //student = 1, teacher = 2
    @OneToOne
    private Student student;

    public User() {
    }

    public User(String login, String password, int userType, Student student) {
        this.login = login;
        this.password = password;
        this.userType = userType;
        this.student = student;
    }

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

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
