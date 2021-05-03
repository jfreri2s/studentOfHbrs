package control;

public class UserDTO {
    String name;
    String vorname;
    String email;
    String passwort;

    public UserDTO(String name, String vorname, String email, String passwort) {
        this.name = name;
        this.vorname = vorname;
        this.email = email;
        this.passwort = passwort;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public String getVorname(){
        return this.vorname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPasswort(String passwort){
        this.passwort = passwort;
    }
    public String getPasswort(){
        return this.passwort;
    }
}
