package com.core_java.geolocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StoreLocator {

    public static List<Store> getNearestStores(double userLat, double userLon, List<Store> stores, double radius) {
        List<Store> filteredStores = new ArrayList<>();

        // Filter stores that are within the specified radius (10 km)
        for (Store store : stores) {
            double distance = store.getDistance(userLat, userLon);
            if (distance <= radius) {
                filteredStores.add(store);
            }
        }

        // Sort stores by distance in ascending order
        filteredStores.sort(Comparator.comparingDouble(store -> store.getDistance(userLat, userLon)));

        return filteredStores;
    }

    public static void main(String[] args) {
        List<Store> stores = Arrays.asList(
                new Store("Store A", 40.7128, -74.0060), // New York
                new Store("Store B", 34.0522, -118.2437), // Los Angeles
                new Store("Store C", 37.7749, -122.4194), // San Francisco
                new Store("Store D", 51.5074, -0.1278)   // London
        );

        double userLat = 50.7306;  // Example user latitude
        double userLon = -73.9352; // Example user longitude

        List<Store> nearestStores = getNearestStores(userLat, userLon, stores, 10.0); // Radius 10 km

        // Print the sorted stores within 10 km
        for (Store store : nearestStores) {
            double distance = store.getDistance(userLat, userLon);
            System.out.println(store.getName() + " - " + String.format("%.2f", distance) + " km");
        }
        int var =10;



    }
}

