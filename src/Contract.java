public class Contract {
    private int contractId;
    private int propertyId;
    private int tenantId;
    private float rentAmount;

    public Contract(int contractId, int propertyId, int tenantId, float rentAmount) {
        this.contractId = contractId;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
        this.rentAmount = rentAmount;
    }
}
