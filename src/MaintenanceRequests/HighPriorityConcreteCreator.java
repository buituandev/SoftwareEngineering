package MaintenanceRequests;

public class HighPriorityConcreteCreator implements RequestCreator{
    @Override
    public RequestProduct createRequest() {
        return new HighPriorityConcrete();
    }

    @Override
    public RequestProduct processRequest() {
        RequestProduct requestProduct = createRequest();
        requestProduct.processRequest();
        return requestProduct;
    }
}