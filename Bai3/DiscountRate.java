package Bai3;

public class DiscountRate {
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type) {
        if (type.equalsIgnoreCase("Premium")) {
            return serviceDiscountPremium;
        } else if (type.equalsIgnoreCase("Gold")) {
            return serviceDiscountGold;
        } else if (type.equalsIgnoreCase("Silver")) {
            return serviceDiscountSilver;
        } else return 0;
    }
    public double getProductDiscountRate(String type) {
        if (type.equalsIgnoreCase("Premium")) {
            return productDiscountPremium;
        } else if (type.equalsIgnoreCase("Gold")) {
            return productDiscountGold;
        } else if (type.equalsIgnoreCase("Silver")) {
            return productDiscountSilver;
        } else return 0;
    }

}
