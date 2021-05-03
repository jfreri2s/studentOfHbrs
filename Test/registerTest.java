import control.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class registerTest {
    @Test
    void test(){
        //UserDTO über Factory
        UserDTO usera   = new UserDTOFactory().createUserWithoutInput();
        UserDTO userb   = new UserDTOFactory().createUseruserWithoutEmail();
        UserDTO userc   = new UserDTOFactory().createUseruserWithoutPassword();
        UserDTO userd   = new UserDTOFactory().createUseruserOnlyName();
        UserDTO usere   = new UserDTOFactory().createUseruserOnlyEmail();
        //UserDTO über Test Builder Pattern
        UserDTO userWithoutInput = new UserDTOBuilder().build();
        UserDTO userWithoutEmail = new UserDTOBuilder().withName("Muster").withPassword("123").build();
        UserDTO userWithoutPassword = new UserDTOBuilder().withName("Muster").withEmail("test123gmail.com").build();
        UserDTO userOnlyName = new UserDTOBuilder().withName("Muster").build();
        UserDTO userOnlyEmail = new UserDTOBuilder().withEmail("test123gmail.com").build();
        //Test der Factory User
        assertEquals("Es wurden keinde Daten eingetragen", new Register().registerUser(usera).getFehler());
        assertEquals("Es wurde keine Email angegeben", new Register().registerUser(userb).getFehler());
        assertEquals("Das Password wurde nicht eingegeben", new Register().registerUser(userc).getFehler());
        assertEquals("Das Password wurde nicht eingegeben", new Register().registerUser(userd).getFehler());
        assertEquals("Das Password wurde nicht eingegeben", new Register().registerUser(usere).getFehler());
        //Test der Builder User
        assertEquals("Es wurden keinde Daten eingetragen", new Register().registerUser(userWithoutInput).getFehler());
        assertEquals("Es wurde keine Email angegeben" , new Register().registerUser(userWithoutEmail).getFehler());
        assertEquals("Das Password wurde nicht eingegeben", new Register().registerUser(userWithoutPassword).getFehler());
        assertEquals("Das Password wurde nicht eingegeben", new Register().registerUser(userOnlyName).getFehler());
        assertEquals("Das Password wurde nicht eingegeben", new Register().registerUser(userOnlyEmail).getFehler());
    }
}
