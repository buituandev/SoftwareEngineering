package MaintenanceRequests;

public class MediumPriorityConcreteCreator implements RequestCreator{
    @Override
    public RequestProduct createRequest() {
        return new MediumPriorityConcrete();
    }

    @Override
    public RequestProduct processRequest() {
        RequestProduct requestProduct = createRequest();
        requestProduct.processRequest();
        return requestProduct;
    }
}