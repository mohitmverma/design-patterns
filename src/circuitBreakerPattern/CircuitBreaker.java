package circuitBreakerPattern;

import circuitBreakerPattern.states.CircuitState;
import circuitBreakerPattern.states.ClosedState;

public class CircuitBreaker {

    private CircuitState state;
    public int failureThreshold;
    public int failureCount;
    public long retryTimeout;
    public long lastFailureTime;

    public CircuitBreaker(int failureThreshold, long retryTimeout) {
        this.state = new ClosedState(this);
        this.failureThreshold = failureThreshold;
        this.retryTimeout = retryTimeout;
        this.failureCount = 0;
        this.lastFailureTime = 0;
    }


    public void execute(Runnable runnable) {
        state.execute(runnable);
    }

    public void recordFailure() {
        state.recordFailure();
    }

    public void recordSuccess() {
        state.recordSuccess();
    }

    public void reset() {
        state.reset();
    }

    public void setState(CircuitState state) {
        this.state = state;
    }

    // Other getter and setter methods
}
