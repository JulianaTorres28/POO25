package clases;

public class usuario extends classPadre {

    private String username;
    private String password;
    
    public usuario(String name, String lastname, String age, String email, String username, String password) {
        super(name, lastname, age, email);
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "usuario [username=" + username + ", password=" + password + "]";
    }

}
