package es.ieslvareda.model;

public class Authentification {
    String email;
    String password;
    public Authentification(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
