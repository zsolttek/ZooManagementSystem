package org.softwire.training.zoo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog extends AbstractAnimal implements SmallAnimal, CanBeGroomed {

    private LocalDateTime lastGroomed;

    public Dog(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void groom() {
        lastGroomed = LocalDateTime.now();
    }
}
