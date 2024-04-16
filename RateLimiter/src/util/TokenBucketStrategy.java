package util;

import util.RateLimiterStrategy;

public class TokenBucketStrategy implements RateLimiterStrategy {
    private final long maxBucketSize;

    private long currentBucketSize;

    private long lastRequestTime;
    private final long refillRate;


    TokenBucketStrategy(long maxBucketSize, long refillRate){
        this.maxBucketSize=maxBucketSize;
        this.refillRate=refillRate;
        currentBucketSize=maxBucketSize;
        lastRequestTime=0;
    }
    public synchronized boolean allowRequest(int tokens) {
        refill();
        lastRequestTime=System.currentTimeMillis();
        if(currentBucketSize >= tokens){
            currentBucketSize-=tokens;
            return true;
        }
        return false;
    }

    public void refill(){
        long currentTime=System.currentTimeMillis();
        long timeElapsed=currentTime-lastRequestTime;
        long tokenToadd=timeElapsed * refillRate;
        currentBucketSize=Math.min(currentBucketSize+tokenToadd, maxBucketSize);
    }
}
