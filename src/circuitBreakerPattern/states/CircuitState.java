package circuitBreakerPattern.states;

public interface CircuitState {

    void execute(Runnable runnable);
    void recordFailure();
    void recordSuccess();
    void reset();
}
