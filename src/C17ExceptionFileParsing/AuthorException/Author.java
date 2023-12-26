package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    static private Long staticId = 0L;
    Author(String name, String email, String password, String phoneNumber) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email= email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}


