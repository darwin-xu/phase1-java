package com.example.ext.lifecycle;

public class SensorDemo {
    private String label = "field label";

    public void showShadowing() {
        String label = "local label";

        System.out.println("local: " + label);
        System.out.println("field: " + this.label);
    }

    public static void main(String[] args) {
        Sensor first = new Sensor();
        Sensor second = new Sensor("gyro", 12.5);
        Sensor third = new Sensor();

        System.out.println(first.getId());
        System.out.println(second.getId());
        System.out.println(third.getId());
        System.out.println("created=" + Sensor.getTotalCreated());

        second.calibrate(18.25);

        SensorDemo demo = new SensorDemo();
        demo.showShadowing();
    }
}