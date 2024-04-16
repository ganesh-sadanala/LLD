package util;

import java.util.concurrent.TimeUnit;

public interface JobScheduler {
    void startScheduler();
    void stopScheduler();
    void scheduleJob(Runnable job, long initialDelay, long period, TimeUnit timeUnit);
}
