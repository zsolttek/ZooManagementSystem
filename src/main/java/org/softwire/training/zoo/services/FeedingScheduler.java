package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.Animal;
import org.softwire.training.zoo.models.Keeper;

import java.util.List;

public class FeedingScheduler extends AbstractScheduler {
    private static FeedingScheduler instance;

    private FeedingScheduler() {
    }

    public static FeedingScheduler getInstance() {
        if (instance == null) {
            instance = new FeedingScheduler();
        }
        return instance;
    }

    public void assignJob(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(keeper::feed));
    }
}
