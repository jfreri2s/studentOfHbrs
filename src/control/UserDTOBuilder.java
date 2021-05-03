package control;

public class UserDTOBuilder {
    String name = "";
    String preName = "";
    String email = "";
    String password = "";

    public UserDTOBuilder() {}

    public UserDTOBuilder withName(String name) {
        this.name = name;
        return this;
    }
    public UserDTOBuilder withPreName(String preName) {
        this.preName = preName;
        return this;
    }
    public UserDTOBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
    public UserDTOBuilder withPassword(String password) {
        this.password = password;
        return this;
    }
    public UserDTO build() {
        return new UserDTO(name,preName, email, password);
    }
}