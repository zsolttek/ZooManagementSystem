package org.softwire.training.zoo;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Config {
    public static Duration getFeedingFrequency() {
        return Duration.of(10, ChronoUnit.SECONDS);
    }
    public static Duration getCleaningFrequency() {
        return Duration.of(15, ChronoUnit.SECONDS);
    }
}
