public interface ContractBuilder {
     ContractBuilder BuildContractId(int contractId);
     ContractBuilder BuildPropertyId(int propertyId);
     ContractBuilder BuildTenantId(int tenantId);
     ContractBuilder BuildRentAmount(float rentAmount);
     Contract SignContract();
     Contract build();
}
