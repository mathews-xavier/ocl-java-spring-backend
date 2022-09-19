package com.oneclick.challenge.payload.request;

public class DataRequest {
    private Long id;
    private int dataId;
    private String resourceId;
    private String resourcename;
    private int quantity;
    private double co2e;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCo2e() {
        return co2e;
    }

    public void setCo2e(double co2e) {
        this.co2e = co2e;
    }

    public DataRequest(Long id, int dataId, String resourceId, String resourcename, int quantity, double co2e) {
        this.id = id;
        this.dataId = dataId;
        this.resourceId = resourceId;
        this.resourcename = resourcename;
        this.quantity = quantity;
        this.co2e = co2e;
    }
}
