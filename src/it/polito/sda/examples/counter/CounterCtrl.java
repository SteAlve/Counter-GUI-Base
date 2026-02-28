package it.polito.sda.examples.counter;

/**
 * Controller class handles user interactions and coordinates between the Counter model and CounterUI view.
 * 
 * @author Marco Torchiano
 * @version 1.0
 */
public class CounterCtrl {
    CounterI counter;

    /**
     * Constructs a new CounterCtrl with the specified counter model.
     * 
     * @param counter the Counter model to control
     */
    public CounterCtrl(CounterI counter){
        this.counter = counter;
    }

    /**
     * Handles the plus button action.
     */
    public void plus(){
        counter.increment();
    }

    /**
     * Handles the minus button action.
     */
    public void minus(){
        counter.decrement();
    }

    /**
     * Handles the reset button action.
     */
    public void reset(){
        counter.reset();
    }

    public int getValue() {
        return counter.getValue();
    }
}
