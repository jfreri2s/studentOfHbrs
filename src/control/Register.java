package control;

public class Register {
    public RegistrationResult registerUser (UserDTO user){
        RegistrationResult userA = new RegistrationResult();
        if(user.email.equals("") && user.passwort .equals("") && user.name.equals("") && user.vorname.equals("")){
            userA.setFehler("Es wurden keinde Daten eingetragen");
            return userA;
        }else if(user.passwort.equals("")) {
            userA.setFehler("Das Password wurde nicht eingegeben");
            return userA;
        } else if(user.email.equals("")) {
            userA.setFehler("Es wurde keine Email angegeben");
            return userA;
        }else{
            return null;
        }
    }
}
