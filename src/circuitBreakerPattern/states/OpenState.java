package circuitBreakerPattern.states;

import circuitBreakerPattern.CircuitBreaker;
import circuitBreakerPattern.exception.CircuitBreakerOpenException;

public class OpenState implements CircuitState {

    private final CircuitBreaker circuitBreaker;

    public OpenState(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    @Override
    public void execute(Runnable runnable) {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - circuitBreaker.lastFailureTime;
        if (elapsedTime >= circuitBreaker.retryTimeout) {
            circuitBreaker.setState(new HalfOpenState(circuitBreaker));
            circuitBreaker.execute(runnable);
        } else {
            throw new CircuitBreakerOpenException();
        }
    }

    @Override
    public void recordFailure() {

    }

    @Override
    public void recordSuccess() {

    }

    @Override
    public void reset() {

    }
}
