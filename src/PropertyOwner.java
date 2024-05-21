import java.util.*;

public class PropertyOwner extends User {

    private List<Property> listOfProperties;
  
    public PropertyOwner(int userId, String password, String email, String userType) {
      super(userId, password, email, userType);
      this.listOfProperties = new ArrayList<>();
    }
  
    public void addProperty(Property property) {
      // Implement logic to check if property is valid
      this.listOfProperties.add(property);
    }
  
    public void removeProperty(Property property) {
      // Implement logic to check if property exists before removal
      this.listOfProperties.remove(property);
    }
  }
  
