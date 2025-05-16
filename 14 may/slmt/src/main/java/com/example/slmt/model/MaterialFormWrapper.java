package com.example.slmt.model;

import java.util.List;

public class MaterialFormWrapper {
    private Integer quotationNumber;
    private String customerName;
    private List<Material> materialList;
    private Double totalPrice;

    // Getters and setters
    public Integer getQuotationNumber() { return quotationNumber; }
    public void setQuotationNumber(Integer quotationNumber) { this.quotationNumber = quotationNumber; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public List<Material> getMaterialList() { return materialList; }
    public void setMaterialList(List<Material> materialList) { this.materialList = materialList; }

    public Double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(Double totalPrice) { this.totalPrice = totalPrice; }
}
