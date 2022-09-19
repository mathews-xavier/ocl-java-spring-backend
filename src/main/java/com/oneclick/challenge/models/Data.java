package com.oneclick.challenge.models;

import org.springframework.stereotype.Component;

import javax.persistence.Embeddable;

@Embeddable
public class Data {
    private int dataId;
    private String resourceId;

    private String resourcename;
    private int quantity;
    private double co2e;

    public Data(int dataId, String resourceId, String resourcename, int quantity, double co2e) {
        this.dataId = dataId;
        this.resourceId = resourceId;
        this.resourcename = resourcename;
        this.quantity = quantity;
        this.co2e = co2e;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public Data() {
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
}

/*
const val = {
      dataId: newData.length,
      resourceId: inputRef.current.value,
      resourcename: rsrcName,
      quantity: 0,
      co2e: 0
    };
 */