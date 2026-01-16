package S.fixed;

public class Main {
   public static void main(String[] args) {
       UserValidator validator = new UserValidator();
         UserService userService = new UserService(validator);

         //Test successful registration and login
         userService.registerUser("john_doe", "Password123");
         userService.loginUser("john_doe", "Password123");

         //Test failed registration due to invalid username
         userService.loginUser("lisa_cho", "testpaswrod1");

         //Test failed login due to incorrect password
         userService.loginUser("john_doe", "WrongPassword");
   } 
}
