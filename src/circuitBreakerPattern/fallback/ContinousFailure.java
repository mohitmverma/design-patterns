package circuitBreakerPattern.fallback;

public class ContinousFailure implements FallbackService {

    public boolean validateFailure() {
        return true;
    }
}
