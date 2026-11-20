package com.aquanest.model;

import java.time.Instant;

public class FlowReading {
    private String id;
    private Instant timestamp;
    private String sensorId;
    private String houseId;        // "MAIN" for main meter, or "H101", "H102", etc.
    private double flowRateLpm;    // Instantaneous flow rate (Litres/min)
    private long pulseCount;       // Raw pulse counter
    private double cumulativeLitres; // Total accumulated volume
    private boolean isValid;

    public FlowReading() {
        this.timestamp = Instant.now();
        this.isValid = true;
    }

    public FlowReading(String id, String sensorId, String houseId, double flowRateLpm, long pulseCount, double cumulativeLitres) {
        this.id = id;
        this.timestamp = Instant.now();
        this.sensorId = sensorId;
        this.houseId = houseId;
        this.flowRateLpm = flowRateLpm;
        this.pulseCount = pulseCount;
        this.cumulativeLitres = cumulativeLitres;
        this.isValid = true;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }

    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }

    public String getHouseId() { return houseId; }
    public void setHouseId(String houseId) { this.houseId = houseId; }

    public double getFlowRateLpm() { return flowRateLpm; }
    public void setFlowRateLpm(double flowRateLpm) { this.flowRateLpm = flowRateLpm; }

    public long getPulseCount() { return pulseCount; }
    public void setPulseCount(long pulseCount) { this.pulseCount = pulseCount; }

    public double getCumulativeLitres() { return cumulativeLitres; }
    public void setCumulativeLitres(double cumulativeLitres) { this.cumulativeLitres = cumulativeLitres; }

    public boolean isValid() { return isValid; }
    public void setValid(boolean valid) { isValid = valid; }
}
