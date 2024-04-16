package util;

import util.JobScheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RuleRetrieverJobScheduler implements JobScheduler {

    private ScheduledExecutorService scheduler;

    @Override
    public void startScheduler() {
        scheduler = Executors.newSingleThreadScheduledExecutor();
    }

    @Override
    public void stopScheduler() {
        if (scheduler != null) {
            scheduler.shutdown();
        }
    }

    @Override
    public void scheduleJob(Runnable job, long initialDelay, long period, TimeUnit timeUnit) {
        if(scheduler != null){
            scheduler.scheduleAtFixedRate(job, initialDelay, period, timeUnit);
        }
    }
}
