package circuitBreakerPattern.states;


import circuitBreakerPattern.CircuitBreaker;

public class ClosedState implements CircuitState {


    private final CircuitBreaker circuitBreaker;

    public ClosedState(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    @Override
    public void execute(Runnable runnable) {
        try {
            runnable.run();
            circuitBreaker.recordSuccess();
        } catch (Exception e) {
            circuitBreaker.recordFailure();
        }
    }

    @Override
    public void recordFailure() {
        circuitBreaker.failureCount++;
        if (circuitBreaker.failureCount >= circuitBreaker.failureThreshold) {
            circuitBreaker.setState(new OpenState(circuitBreaker));
            circuitBreaker.lastFailureTime = System.currentTimeMillis();
        }
    }

    @Override
    public void recordSuccess() {
        circuitBreaker.reset();
    }

    @Override
    public void reset() {
        circuitBreaker.reset();
    }
}

