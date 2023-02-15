package assignment.as0213;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer uno;
    private String id;
    private String pw;
    private Date regDate;
    private Date upDate;

    @Override
    public String toString() {
        return "User{" +
                "uno=" + uno +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", regDate=" + regDate +
                ", upDate=" + upDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uno.equals(user.uno) && id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uno, id);
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public User(){};
    public User(Integer uno, String id, String pw, Date regDate, Date upDate) {
        this.uno = uno;
        this.id = id;
        this.pw = pw;
        this.regDate = regDate;
        this.upDate = upDate;
    }
}
