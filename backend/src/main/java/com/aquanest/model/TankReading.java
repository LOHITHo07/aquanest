package com.aquanest.model;

import java.time.Instant;

public class TankReading {
    private String id;
    private Instant timestamp;
    private double levelPercent;               // e.g. 72.5%
    private double waterLitres;                // e.g. 2900.0 L
    private double capacityLitres;             // e.g. 4000.0 L
    private String sensorId;                   // "JSN_SR04T_01"
    private String pumpStatus;                 // "ON" or "OFF"
    private String pumpMode;                   // "AUTO" or "MANUAL"
    private double fillRateLpm;                // filling rate in litres/min
    private double emptyRateLpm;               // emptying rate in litres/min
    private double estimatedTimeToFullMinutes; // minutes to reach FULL_THRESHOLD
    private double estimatedTimeToEmptyMinutes;// minutes to reach LOW_THRESHOLD

    public TankReading() {
        this.timestamp = Instant.now();
        this.capacityLitres = 4000.0;
        this.pumpStatus = "OFF";
        this.pumpMode = "AUTO";
    }

    public TankReading(String id, double levelPercent, double waterLitres, double capacityLitres, String pumpStatus) {
        this.id = id;
        this.timestamp = Instant.now();
        this.levelPercent = levelPercent;
        this.waterLitres = waterLitres;
        this.capacityLitres = capacityLitres;
        this.pumpStatus = pumpStatus;
        this.pumpMode = "AUTO";
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }

    public double getLevelPercent() { return levelPercent; }
    public void setLevelPercent(double levelPercent) { this.levelPercent = levelPercent; }

    public double getWaterLitres() { return waterLitres; }
    public void setWaterLitres(double waterLitres) { this.waterLitres = waterLitres; }

    public double getCapacityLitres() { return capacityLitres; }
    public void setCapacityLitres(double capacityLitres) { this.capacityLitres = capacityLitres; }

    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }

    public String getPumpStatus() { return pumpStatus; }
    public void setPumpStatus(String pumpStatus) { this.pumpStatus = pumpStatus; }

    public String getPumpMode() { return pumpMode; }
    public void setPumpMode(String pumpMode) { this.pumpMode = pumpMode; }

    public double getFillRateLpm() { return fillRateLpm; }
    public void setFillRateLpm(double fillRateLpm) { this.fillRateLpm = fillRateLpm; }

    public double getEmptyRateLpm() { return emptyRateLpm; }
    public void setEmptyRateLpm(double emptyRateLpm) { this.emptyRateLpm = emptyRateLpm; }

    public double getEstimatedTimeToFullMinutes() { return estimatedTimeToFullMinutes; }
    public void setEstimatedTimeToFullMinutes(double estimatedTimeToFullMinutes) { this.estimatedTimeToFullMinutes = estimatedTimeToFullMinutes; }

    public double getEstimatedTimeToEmptyMinutes() { return estimatedTimeToEmptyMinutes; }
    public void setEstimatedTimeToEmptyMinutes(double estimatedTimeToEmptyMinutes) { this.estimatedTimeToEmptyMinutes = estimatedTimeToEmptyMinutes; }
}
