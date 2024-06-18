package com.example.springboot.util;

public class GeoDistanceCalculator {
    private static final double EARTH_RADIUS_IN_METRES = 6371e3;

    public static double calculateDistanceOfPoints(Point first, Point second) {
        double lat1 = Math.toRadians(first.getLatitude());
        double lat2 = Math.toRadians(second.getLatitude());

        double lon1 = Math.toRadians(first.getLongitude());
        double lon2 = Math.toRadians(second.getLongitude());

        double latDelta = lat2 - lat1;
        double lonDelta = lon2 - lon1;

        double a = Math.sin(latDelta / 2) * Math.sin(latDelta / 2) + Math.cos(lat1) * Math.cos(lat2) * Math.sin(lonDelta / 2) * Math.sin(lonDelta / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS_IN_METRES * c;
    }
}
