public class RentalContract {

    private int contractId;
    private int propertyId;
    private int tenantId;
    private double rentAmount;
    private String status; // Add a status attribute to track contract lifecycle
  
    public RentalContract(int contractId, int propertyId, int tenantId, double rentAmount) {
      this.contractId = contractId;
      this.propertyId = propertyId;
      this.tenantId = tenantId;
      this.rentAmount = rentAmount;
      this.status = "Active"; // Set initial status as active
    }
  
    // Simulates contract creation logic
    public void createContract() {
      System.out.println("Rental Contract #{contractId} created successfully!");
    }
  
    public void terminateContract() {
      if (this.status.equals("Active")) {
        this.status = "Terminated";
        System.out.println("Rental Contract #{contractId} terminated.");
      } else {
        System.out.println("Rental Contract #{contractId} is already terminated.");
      }
    }
  
    // Getters for accessing contract attributes
    public int getContractId() {
      return contractId;
    }
  
    public int getPropertyId() {
      return propertyId;
    }
  
    public int getTenantId() {
      return tenantId;
    }
  
    public double getRentAmount() {
      return rentAmount;
    }
  
    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
  }
  