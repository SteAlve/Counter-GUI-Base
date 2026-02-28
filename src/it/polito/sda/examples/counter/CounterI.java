package it.polito.sda.examples.counter;

public interface CounterI {
    void increment();
    boolean decrement();
    void reset();
    int getValue();
}
