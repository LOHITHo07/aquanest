package com.aquanest.model;

import java.time.Instant;

public class Sensor {
    private String sensorId;
    private String sensorType;      // "ULTRASONIC", "FLOW_MAIN", "FLOW_HOUSE", "PRESSURE"
    private String houseId;         // e.g. "H101" or "MAIN_TANK"
    private double calibrationFactor; // pulses per litre, e.g. 450.0
    private String status;          // "ONLINE", "OFFLINE", "FAULT"
    private double lastReading;     // latest metric value
    private String unit;            // "%", "L/min", "bar"
    private Instant lastSeen;

    public Sensor() {
        this.status = "ONLINE";
        this.lastSeen = Instant.now();
        this.calibrationFactor = 450.0;
    }

    public Sensor(String sensorId, String sensorType, String houseId, double calibrationFactor, String unit) {
        this.sensorId = sensorId;
        this.sensorType = sensorType;
        this.houseId = houseId;
        this.calibrationFactor = calibrationFactor;
        this.unit = unit;
        this.status = "ONLINE";
        this.lastSeen = Instant.now();
    }

    // Getters and Setters
    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }

    public String getSensorType() { return sensorType; }
    public void setSensorType(String sensorType) { this.sensorType = sensorType; }

    public String getHouseId() { return houseId; }
    public void setHouseId(String houseId) { this.houseId = houseId; }

    public double getCalibrationFactor() { return calibrationFactor; }
    public void setCalibrationFactor(double calibrationFactor) { this.calibrationFactor = calibrationFactor; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getLastReading() { return lastReading; }
    public void setLastReading(double lastReading) { this.lastReading = lastReading; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public Instant getLastSeen() { return lastSeen; }
    public void setLastSeen(Instant lastSeen) { this.lastSeen = lastSeen; }
}
