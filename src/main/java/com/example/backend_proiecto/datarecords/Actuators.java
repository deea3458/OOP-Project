package com.example.backend_proiecto.datarecords;

// apparently records are more suitable data transfer objects, easier to be carried out to the JavaFX and they are immutable and these fields won't change anyway

public record Actuators(
        String deviceId,
        String actuator,
        boolean value,
        String timestamp
) {}
