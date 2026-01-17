package S.fixed;
import java.util.*;

public class UserService {
    UserValidator userValidator;
    Map<String, User> registeredUsers = new HashMap<>();

    public UserService(UserValidator userValidator) {
        this.userValidator = userValidator;
        registeredUsers = new HashMap<>();
    }

    public void registerUser(String username, String password) {
        User user = new User(username, password);

        if(!userValidator.validateUser(user)) {
            IOManager.print("Invalid username or password format.");
            return;
        }

        if(registeredUsers.containsKey(username)) {
            IOManager.print("Username already exists.");
            return;
        }

        registeredUsers.put(username, user);
        IOManager.print("User registered successfully.");
    }

    public void loginUser(String username, String password) {
        User storedUser = registeredUsers.get(username);
        if (storedUser == null) {
            IOManager.print("User not found");
            return;
        }

        // Verify password
        if (!storedUser.getPassword().equals(password)) {
            IOManager.print("Incorrect password");
            return;
        }

        IOManager.print("User logged in");
    }
}
