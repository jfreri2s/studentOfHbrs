package control;

public class UserDTOFactory {
    public UserDTO createUserWithoutInput(){ return new UserDTO("","","",""); }
    public UserDTO createUseruserWithoutEmail(){
        return new UserDTO("Muster","","","123");
    }
    public UserDTO createUseruserWithoutPassword(){
        return new UserDTO("Muster","","test123@gmail.com","");
    }
    public UserDTO createUseruserOnlyName(){
        return new UserDTO("Muster","","","");
    }
    public UserDTO createUseruserOnlyEmail(){
        return new UserDTO("","","test123gmail","");
    }
}
