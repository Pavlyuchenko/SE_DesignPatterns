/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.telephone;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 10;
        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
