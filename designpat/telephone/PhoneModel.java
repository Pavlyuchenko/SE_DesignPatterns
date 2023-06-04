/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */

public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    private List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);

        // Notify all observers
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}

interface Observer {
    public void update();
}