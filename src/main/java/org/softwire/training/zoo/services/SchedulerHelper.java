package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.Animal;
import org.softwire.training.zoo.models.Keeper;

import java.util.List;

public class SchedulerHelper {

    private SchedulerHelper() {}

    public static void assignJobs(List<AbstractScheduler> schedulers, List<Keeper<? extends Animal>> keepers) {
        schedulers.forEach(scheduler -> scheduler.assignJob(keepers));
    }
}
