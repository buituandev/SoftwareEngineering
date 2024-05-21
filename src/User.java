
public class User {

    private int userId;
    private String password;
    private String email;
    private String userType;

    public User() {
    }

    public User(int userId, String password, String email, String userType) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User creatUser(int userId, String password, String email, String userType) {
        return new User(userId, password, email, userType);
    }

    public void resetPassword(String password) {
        this.password = password;
    }
}
