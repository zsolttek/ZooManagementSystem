package org.softwire.training.zoo.models;

import org.softwire.training.zoo.Config;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zebra extends AbstractAnimal implements LargeAnimal, CanBeGroomed {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastCleaned = LocalDateTime.now().minusHours(1);

    public Zebra(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    public void clean() {
        lastCleaned = LocalDateTime.now();
    }

    @Override
    public boolean requiresCleaning() {
        return Duration.between(lastCleaned, LocalDateTime.now()).compareTo(Config.getCleaningFrequency()) > 0;
    }


    @Override
    public void groom() {
        lastGroomed = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}; Last Cleaned {2}", super.toString(), lastGroomed, lastCleaned);
    }
}
