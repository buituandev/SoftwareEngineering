import java.util.*;

public class RegisteredUser extends User {

    private List<User> listOfUsers;
  
    public RegisteredUser(int userId, String password, String email, String userType) {
      super(userId, password, email, userType);
      this.listOfUsers = new ArrayList<>();
    }
  
    public void addUser(User user) {
      // Implement logic to check if user can be added
      this.listOfUsers.add(user);
    }
  
    public void removeUser(User user) {
      // Implement logic to check if user exists before removal
      this.listOfUsers.remove(user);
    }
  }
  