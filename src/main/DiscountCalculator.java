package main;

public class DiscountCalculator {

    double price;
    double percentage;

    public DiscountCalculator(double price, double percentage) {
        this.price = price;
        this.percentage = percentage;
    }

    public double discountPrice(){
       return price * (percentage/100);
    }

    public double discountedPrice(){
        return price - discountPrice();
    }


}
