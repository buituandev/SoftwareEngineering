public class Property {
    private int propertyId;
    private String description;
    private int propertyOwnerID;

    public Property() {
    }

    public Property(String description, int propertyId, int propertyOwnerID) {
        this.description = description;
        this.propertyId = propertyId;
        this.propertyOwnerID = propertyOwnerID;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPropertyOwnerID() {
        return propertyOwnerID;
    }

    public void setPropertyOwnerID(int propertyOwnerID) {
        this.propertyOwnerID = propertyOwnerID;
    }
}
