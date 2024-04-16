package modal;

@Entity
public class RateLimitingRules {
    String clientId;

    long limit;

    long window;

    String strategy;
}
