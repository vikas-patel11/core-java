package com.core_java.geolocation;

public class Store {
    private String name;
    private double latitude;
    private double longitude;

    public Store(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Simple Euclidean distance approximation (not ideal for large distances, but simple)
    public double getDistance(double userLat, double userLon) {
        final double R = 6371.0; // Earth radius in km
        double latDistance = Math.toRadians(latitude - userLat);
        double lonDistance = Math.toRadians(longitude - userLon);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                Math.cos(Math.toRadians(userLat)) * Math.cos(Math.toRadians(latitude)) *
                        Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // Distance in km
    }
}

