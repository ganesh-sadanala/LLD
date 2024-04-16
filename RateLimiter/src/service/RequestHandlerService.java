package service;

import util.RateLimiterStrategy;

@Service
public class RequestHandlerService {

    RateLimiterStrategy rateLimiterStrategy;

    RulesCache rulesCache;

    public void handleRequest(String clientId, long timestamp){

    }

}
