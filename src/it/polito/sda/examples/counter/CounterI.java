package it.polito.sda.examples.counter;

public interface CounterI {
    
    /**
     * Increments the counter value by one.
     */
    void increment();

    /**
     * Decrements the counter value by one.
     * @return false if the decrementation can't be done otherwise true
     */
    boolean decrement();

    /**
     * Resets the counter value to zero.
     */
    void reset();

    /**
     * Returns the current value of the counter.
     * 
     * @return the current counter value
     */
    int getValue();
}
