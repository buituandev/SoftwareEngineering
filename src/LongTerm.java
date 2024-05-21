public class LongTerm implements ContractBuilder {
    private int contractId;
    private float rentAmount;
    private int tenantId;
    private int propertyId;

    @Override
    public ContractBuilder BuildContractId(int contractId) {
        this.contractId = contractId;
        return this;
    }

    @Override
    public ContractBuilder BuildPropertyId(int propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    @Override
    public ContractBuilder BuildTenantId(int tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @Override
    public ContractBuilder BuildRentAmount(float rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract SignContract() {
        return null;
    }

    @Override
    public Contract build() {
        return new Contract(this.contractId, this.propertyId, this.tenantId, this.rentAmount);
    }
}
