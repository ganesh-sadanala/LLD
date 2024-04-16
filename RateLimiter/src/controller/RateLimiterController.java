package controller;

import service.RequestHandlerService;
import service.RulesService;
import util.JobScheduler;
import util.RuleRetrieverJobScheduler;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/v1/ratelimiter")
public class RateLimiterController {

    JobScheduler jobScheduler;

    RulesService rulesService;

    RequestHandlerService service;

    void init(){
        jobScheduler=new RuleRetrieverJobScheduler();
        jobScheduler.startScheduler();
        jobScheduler.scheduleJob(new Runnable() {
            @Override
            public void run() {
                //...
                // rulesService...
            }
        }, 0, 5, TimeUnit.MINUTES);
    }

    /*
    GET /v1/ratelimiter/requests/{clientId}?timestamp={value}
    Description: Checks if a request from a client is allowed based on the rate limiting rules.
    Parameters:
    - clientId (required): The unique identifier of the client making the request.
    - timestamp (required): The timestamp of the request in milliseconds.
    Response:
    - 200 OK: If the request is allowed.
      - Body: true
    - 429 Too Many Requests: If the request is not allowed due to rate limiting.
      - Body: false
    * */
    @GetMapping("/requests/{clientId}")
    public ResponseEntity isRequestAllowed(@PathVariable("clientId") String clientId, @QueryParam("timestamp")long timestamp){
        service.handleRequest(clientId, timestamp);
    }

    /*
    PUT /rules

     */
    @PutMapping("/rules")
    public ResponseEntity updateRules(@RequestBody List<RateLimitingRule> rules){
        rulesService.updateRules(rules);
        return ResponseEntity.ok().build();
    }



}
