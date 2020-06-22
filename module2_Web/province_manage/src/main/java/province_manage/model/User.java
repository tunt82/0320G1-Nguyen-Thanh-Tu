package province_manage.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account")
    private String account;
    @Column(name = "password")
    private String password;

    @Column(name = "name")
    @NotNull
    @Size(min=2,max=30)
    private String name;

    @Column(name = "email")
    @Pattern(regexp ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$",message = "Email error, please try against")
    private String email;

    @Column(name = "age")
    @Min(value = 18,message = "Nhập lại tuổi trên 18")
    private Long age;

    @Column(name = "isDelete")
    private Boolean is_delete;

    public User() {
    }
    public User(Long id, String account, String password, String name, String email, Long age,Boolean is_delete ) {
        this.id=id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.email = email;
        this.age = age;
        this.is_delete=is_delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }
}
