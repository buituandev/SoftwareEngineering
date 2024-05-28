package MaintenanceRequests;

public class LowPriorityConcreteCreator implements RequestCreator{
    @Override
    public RequestProduct createRequest() {
        return new LowPriorityConcrete();
    }

    @Override
    public RequestProduct processRequest() {
        RequestProduct requestProduct = createRequest();
        requestProduct.processRequest();
        return requestProduct;
    }
}