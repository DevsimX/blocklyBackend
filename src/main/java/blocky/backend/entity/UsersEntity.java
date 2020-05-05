package blocky.backend.entity;

public class UsersEntity {

    private long id;
    private String username;
    private String password;
    private long role;
    private String name;
    private String email;



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

    @Override
    public String toString() {
        String token = "abcdefgm";
        return "{" +
                "id:" + id +
                ", username:'" + username + '\'' +
                ", token:'" + token + '\'' +
                ", role:'" + transferRoleFromIntToString() + '\'' +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                '}';
    }
}

