package com.example.ext.lifecycle;

public class Sensor {
    private static int nextNumber = 1;
    private static int totalCreated = 0;

    private final String id;
    private double reading;

    public Sensor() {
        this(nextId(), 0.0);
    }

    public Sensor(String id) {
        this(id, 0.0);
    }

    public Sensor(String id, double reading) {
        this.id = id;
        this.reading = reading;
        totalCreated++;
    }

    private static String nextId() {
        String id = "sensor-" + nextNumber;
        nextNumber++;
        return id;
    }

    public void calibrate(double reading) {
        double previousReading = this.reading;
        this.reading = reading;

        System.out.println("previous=" + previousReading);
        System.out.println("current=" + this.reading);
    }

    public String getId() {
        return id;
    }

    public double getReading() {
        return reading;
    }

    public static int getTotalCreated() {
        return totalCreated;
    }
}