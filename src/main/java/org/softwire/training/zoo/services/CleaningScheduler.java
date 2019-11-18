package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.Animal;
import org.softwire.training.zoo.models.Keeper;
import org.softwire.training.zoo.models.LargeAnimal;

import java.util.List;

public class CleaningScheduler extends AbstractScheduler {
    private static CleaningScheduler instance;

    private CleaningScheduler() {
    }

    public static CleaningScheduler getInstance() {
        if(instance == null) {
            instance = new CleaningScheduler();
        }
        return instance;
    }

    @Override
    public void assignJob(List<Keeper<? extends Animal>> keepers) {
        for(Keeper keeper : keepers) {
            for(Object animal : keeper.getResponsibleAnimals()) {
                if((animal instanceof LargeAnimal) && ((LargeAnimal) animal).requiresCleaning()) {
                        keeper.clean((LargeAnimal) animal);
                }
            }
        }
    }

}
