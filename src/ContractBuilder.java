public interface ContractBuilder {
    public ContractBuilder BuildContractId(int contractId);
    public ContractBuilder BuildPropertyId(int propertyId);
    public ContractBuilder BuildTenantId(int tenantId);
    public ContractBuilder BuildRentAmount(float rentAmount);
    public Contract SignContract();
}
