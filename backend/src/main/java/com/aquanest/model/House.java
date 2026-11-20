package com.aquanest.model;

import java.time.Instant;

public class House {
    private String houseId;        // e.g. "H101"
    private String houseNumber;    // e.g. "101"
    private int floor;             // e.g. 1
    private String residentId;     // userId
    private String residentName;
    private String meterId;        // e.g. "METER_101"
    private String status;         // "ACTIVE", "INACTIVE"
    private double currentUsageLitres;
    private double todayUsageLitres;
    private double monthlyUsageLitres;
    private double averageDailyLitres;
    private double peakUsageLitres;
    private String anomalyStatus;  // "NORMAL", "ABNORMAL"
    private Instant createdAt;
    private Instant lastUpdated;

    public House() {
        this.createdAt = Instant.now();
        this.lastUpdated = Instant.now();
        this.status = "ACTIVE";
        this.anomalyStatus = "NORMAL";
    }

    public House(String houseId, String houseNumber, int floor, String residentId, String residentName, String meterId) {
        this.houseId = houseId;
        this.houseNumber = houseNumber;
        this.floor = floor;
        this.residentId = residentId;
        this.residentName = residentName;
        this.meterId = meterId;
        this.status = "ACTIVE";
        this.anomalyStatus = "NORMAL";
        this.createdAt = Instant.now();
        this.lastUpdated = Instant.now();
    }

    // Getters and Setters
    public String getHouseId() { return houseId; }
    public void setHouseId(String houseId) { this.houseId = houseId; }

    public String getHouseNumber() { return houseNumber; }
    public void setHouseNumber(String houseNumber) { this.houseNumber = houseNumber; }

    public int getFloor() { return floor; }
    public void setFloor(int floor) { this.floor = floor; }

    public String getResidentId() { return residentId; }
    public void setResidentId(String residentId) { this.residentId = residentId; }

    public String getResidentName() { return residentName; }
    public void setResidentName(String residentName) { this.residentName = residentName; }

    public String getMeterId() { return meterId; }
    public void setMeterId(String meterId) { this.meterId = meterId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getCurrentUsageLitres() { return currentUsageLitres; }
    public void setCurrentUsageLitres(double currentUsageLitres) { this.currentUsageLitres = currentUsageLitres; }

    public double getTodayUsageLitres() { return todayUsageLitres; }
    public void setTodayUsageLitres(double todayUsageLitres) { this.todayUsageLitres = todayUsageLitres; }

    public double getMonthlyUsageLitres() { return monthlyUsageLitres; }
    public void setMonthlyUsageLitres(double monthlyUsageLitres) { this.monthlyUsageLitres = monthlyUsageLitres; }

    public double getAverageDailyLitres() { return averageDailyLitres; }
    public void setAverageDailyLitres(double averageDailyLitres) { this.averageDailyLitres = averageDailyLitres; }

    public double getPeakUsageLitres() { return peakUsageLitres; }
    public void setPeakUsageLitres(double peakUsageLitres) { this.peakUsageLitres = peakUsageLitres; }

    public String getAnomalyStatus() { return anomalyStatus; }
    public void setAnomalyStatus(String anomalyStatus) { this.anomalyStatus = anomalyStatus; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(Instant lastUpdated) { this.lastUpdated = lastUpdated; }
}
