package it.polito.sda.examples.counter;

/**
 * Represents a simple counter model that maintains an integer value.
 * The counter supports increment, decrement, and reset operations.
 * The value cannot be decremented below zero.
 * 
 * @author SDA Examples
 * @version 1.0
 */
public class Counter implements CounterI{

    private int value;

    /**
     * Increments the counter value by one.
     */
    @Override
    public void increment(){ 
        value++;
    }

    /**
     * Decrements the counter value by one.
     * @return false if the decrementation can't be done otherwise true
     */
    @Override
    public boolean decrement(){ 
        if(value==0) return false;
        value--;
        return true;
    }

    /**
     * Resets the counter value to zero.
     */
    @Override
    public void reset(){
        value=0;
    }

    /**
     * Returns the current value of the counter.
     * 
     * @return the current counter value
     */
    @Override
    public int getValue(){ return value; }
}
