package web.model;


import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "userFirstName")
    private String userFirstName;
    @Column(name = "userFamilyName")
    private String userFamilyName;

    public User(String userFirstName, String userFamilyName) {
        this.userFirstName = userFirstName;
        this.userFamilyName = userFamilyName;
    }
    protected User(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserFamilyName() {
        return userFamilyName;
    }

    public void setUserFamilyName(String userFamilyName) {
        this.userFamilyName = userFamilyName;
    }
}
