package Bai3;

import java.util.Date;

public class Visit {
    private Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit (String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }
    public double getTotalExpense() {

        DiscountRate discountRate = new DiscountRate();
        double productDiscount =
                discountRate.getProductDiscountRate(this.customer.getMemberType());
        double serviceDiscount =
                discountRate.getServiceDiscountRate(this.customer.getMemberType());


        double product =  productExpense - (productExpense*productDiscount);
        double service =  serviceExpense - (serviceExpense*serviceDiscount);

        return product + service;
    }

}
