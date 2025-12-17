package com.example.backend_proiecto.datarecords;

public record Actuators(
        String deviceId,
        String actuator,
        boolean value,
        String timestamp
) {}
