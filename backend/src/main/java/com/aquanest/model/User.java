package com.aquanest.model;

import java.time.Instant;

public class User {
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String role; // "ADMIN" or "RESIDENT"
    private String houseId;
    private String status; // "ACTIVE", "PENDING", "SUSPENDED"
    private Instant createdAt;

    public User() {
        this.createdAt = Instant.now();
        this.status = "ACTIVE";
    }

    public User(String userId, String name, String email, String phone, String role, String houseId) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.houseId = houseId;
        this.status = "ACTIVE";
        this.createdAt = Instant.now();
    }

    // Getters and Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getHouseId() { return houseId; }
    public void setHouseId(String houseId) { this.houseId = houseId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
