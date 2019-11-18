package org.softwire.training.zoo.models;

import org.softwire.training.zoo.Config;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lion extends AbstractAnimal implements LargeAnimal {

    private LocalDateTime lastCleaned = LocalDateTime.now().minusSeconds(5);

    public Lion(LocalDate dateOfBirth) {
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
    public String toString() {
        return MessageFormat.format("{0}; Last Cleaned {1}", super.toString(), lastCleaned);
    }
}
