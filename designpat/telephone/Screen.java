/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.telephone;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;

        model.addObserver(new Observer() {
            public void update() {
                System.out.println("Screen: " + model.getDigits().get(model.getDigits().size() - 1));
            }
        });

        model.addObserver(new Observer() {
            public void update() {
                if (model.getDigits().size() == 10) {
                    String phoneNumber = "";
                    for (int digit : model.getDigits()) {
                        phoneNumber += digit;
                    }

                    System.out.println("Now dialing: " + phoneNumber + "...");
                }
            }
        });
    }
}
