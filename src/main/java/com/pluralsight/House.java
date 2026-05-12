package com.pluralsight;

public class House extends Asset{
    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSquareFoot;

        if (condition == 1) {
            pricePerSquareFoot = 180.00; // $180.00 per square foot (excellent)
        } else if (condition == 2) {
            pricePerSquareFoot = 130.00; // $130.00 per square foot (good)
        } else if (condition == 3) {
            pricePerSquareFoot = 90.00; // $90.00 per square foot (fair)
        } else if (condition == 4) {
            pricePerSquareFoot = 80.00; // $80.00 per square foot (poor)
        } else {
            pricePerSquareFoot = 0.00;
        }

        return (squareFoot * pricePerSquareFoot) + (lotSize * 0.25); // PLUS 25 cents per square foot of lot size
    }

}
