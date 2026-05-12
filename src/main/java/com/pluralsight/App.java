package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Vacation home", "2019-05-22", 180000.00, "456 Lake View Drive", 1, 1600, 12000));

        assets.add(new House("Rental property", "2021-09-14", 140000.00, "789 Oak Street", 3, 1200, 6000));

        assets.add(new Vehicle("Work truck", "2022-03-20", 35000.00, "Ford F-150", 2021, 45000));

        assets.add(new Vehicle("Family car", "2018-08-15", 22000.00, "Toyota Camry", 2017, 120000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());
            System.out.println();
        }
    }
}
