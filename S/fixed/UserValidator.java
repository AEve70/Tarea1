package TareaPrincipiosDise-o.S.fixed;

public class UserValidator {
  
     private boolean validateUsername(String username) {
        return username != null && username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

     private boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

    public boolean validateUser(User user){
        return validateUser(user.getUsername) && validatePassword(user.getPassword());
    }
    
}
