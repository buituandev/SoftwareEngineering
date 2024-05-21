import java.util.*;

public class Tenant extends User {

    private List<RentalContract> listOfContracts;
  
    public Tenant(int userId, String password, String email, String userType) {
      super(userId, password, email, userType);
      this.listOfContracts = new ArrayList<>();
    }
  
    public RentalContract requestCreateRentalContract(Property property, String startDate, String endDate) {
      // Implement logic to prepare and submit a request
      // This method might return a RentalContract object or a confirmation ID
  
      // Simulate request creation and return a placeholder RentalContract
      RentalContract draftContract = new RentalContract(0, property.getPropertyId(), this.getUserId(), 0.0);
      draftContract.setStatus("Pending"); // Set initial status of draft contract
      System.out.println("Rental contract request submitted for property: " + property.getDescription());
      return draftContract;
    }
  
    public void requestTerminateRentalContract(RentalContract contract) {
      // Implement logic to submit a termination request for an existing contract if it's active
      // This method might return a confirmation or handle logic based on contract status
  
      if (listOfContracts.contains(contract) && contract.getStatus().equals("Active")) {
        contract.terminateContract();
        System.out.println("Termination request submitted for Rental Contract: " + contract.getContractId());
      } else {
        System.out.println("Contract termination failed. Contract not found or already terminated.");
      }
    }
  
    public List<RentalContract> getListOfContracts() {
      return Collections.unmodifiableList(listOfContracts); // Return an unmodifiable list
    }
  
    // Add a method to add a confirmed RentalContract to the tenant's list
    public void addConfirmedContract(RentalContract contract) {
      if (contract.getStatus().equals("Active")) {
        this.listOfContracts.add(contract);
      } else {
        System.out.println("Contract could not be added. Contract status is not 'Active'.");
      }
    }
  }
  
