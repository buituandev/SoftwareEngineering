package MaintenanceRequests;

public class MediumPriorityConcrete extends RequestProduct {

    public MediumPriorityConcrete() {
        super("Medium", "28/06/2024", "Accepted");
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated\n" +
                "completion date is 28/06/2024.");
    }
}
