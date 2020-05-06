package blocky.backend.entity;

import blocky.backend.util.JavaWebToken;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UsersEntity {

    private long id;
    private String username;
    private String password;
    private long role;
    private String name;
    private String email;

    public UsersEntity(String username,String password,long role,String name,String email){
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.email = email;
    }
    public UsersEntity(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public long getRole() {
        return role;
    }

    public void setRole(long role) {
        this.role = role;
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

    private String transferRoleFromIntToString(){
        return this.role == 0? "teacher":"student";
    }

    private String calculateToken(){
        String token = "";
        if(id != 0){
            Map<String, Object> claims = new HashMap<>();
            Date now = new Date();
            claims.put("username",username);
            claims.put("time",new SimpleDateFormat("yyyyMMddHHmmss").format(now));
            token = JavaWebToken.createJavaWebToken(claims);
        }
        return token;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", username:'" + username + '\'' +
                ", token:'" + calculateToken() + '\'' +
                ", role:'" + transferRoleFromIntToString() + '\'' +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                '}';
    }
}

