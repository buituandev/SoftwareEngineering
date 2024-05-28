package MaintenanceRequests;

import java.util.Date;

public class LowPriorityConcrete extends RequestProduct {

    public LowPriorityConcrete() {
        super("Ignore", new Date().toString(), "Done");
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied.");
    }
}
