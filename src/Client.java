public class Client {
    public static void main(String[] args) {
        requestCreateContract();
    }

    public static void requestCreateContract() {
        var contract = new Permanent().BuildContractId(1).BuildPropertyId(1).BuildTenantId(1).BuildRentAmount(1000).SignContract();
    }
}
