package util;

import util.RateLimiterStrategy;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowStrategy implements RateLimiterStrategy {

    private final long windowSize;
    private final long rateLimit;
    private Queue<Long> requestTimestamps;


    SlidingWindowStrategy(long windowSize, long rateLimit){
        this.windowSize=windowSize;
        this.rateLimit=rateLimit;
        requestTimestamps=new LinkedList<>();
    }

    public synchronized boolean allowRequest() {
        long currentTime=System.currentTimeMillis();
        while(!requestTimestamps.isEmpty() && currentTime-requestTimestamps.peek()>windowSize) requestTimestamps.poll();
        if(requestTimestamps.size() <= rateLimit) return true;
        return false;
    }
}
