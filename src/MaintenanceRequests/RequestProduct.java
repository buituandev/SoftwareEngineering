package MaintenanceRequests;

public abstract class RequestProduct {
    private String priority;
    private String expireDate;
    private String status;

    public RequestProduct(String priority, String expireDate, String status) {
        this.priority = priority;
        this.expireDate = expireDate;
        this.status = status;
    }

    //SetPriority
    public void setPriority(String priority){
        this.priority = priority;
    };

    //SetExpireDate
    public void setExpireDate(String expireDate){
        this.expireDate = expireDate;
    };

    //SetStatus
    public void setStatus(String status){
        this.status = status;
    };

    //ProcessRequest
    public abstract void processRequest();

}
