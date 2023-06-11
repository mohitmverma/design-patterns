package circuitBreakerPattern.states;

import circuitBreakerPattern.CircuitBreaker;

public class HalfOpenState implements CircuitState {
    private final CircuitBreaker circuitBreaker;

    public HalfOpenState(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    @Override
    public void execute(Runnable runnable) {
        try {
            runnable.run();
            circuitBreaker.recordSuccess();
            circuitBreaker.setState(new ClosedState(circuitBreaker));
        } catch (Exception e) {
            circuitBreaker.recordFailure();
            circuitBreaker.setState(new OpenState(circuitBreaker));
            circuitBreaker.lastFailureTime = System.currentTimeMillis();
        }
    }

    @Override
    public void recordFailure() {
        circuitBreaker.recordFailure();
    }

    @Override
    public void recordSuccess() {
        circuitBreaker.recordSuccess();
    }

    @Override
    public void reset() {
        circuitBreaker.reset();
    }
}

