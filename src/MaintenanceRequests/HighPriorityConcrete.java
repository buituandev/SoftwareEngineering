package MaintenanceRequests;

import java.util.Date;

public class HighPriorityConcrete extends RequestProduct {

    public HighPriorityConcrete() {
        super("Emergency", new Date().toString(), "Accept");
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our\n" + "Administer will contact you immediately !");
    }
}
