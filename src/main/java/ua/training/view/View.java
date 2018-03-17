package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.training.MessagesConstants.*;

/**
 * * <p>The <tt>Controller</tt> class provides console view,
 * which contains print methonds and uses to interact with the user.
 * @author Roydgar
 * @version 1.0
 */

public class View {

    private static ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            //new Locale("ru")
            new Locale("en")
    );

    /**
     * Prints given message to the console
     * @param message String to print
     */
    public void print(String message) {
        System.out.println(message);
    }

    /**
     * Prints offering message to the console
     */
    public void printInputWidthMessage() {print(bundle.getString(INPUT_WIDTH));}


    /**
     * Prints offering message to the console
     */
    public void printInputHeightMessage() {print(bundle.getString(INPUT_HEIGHT));}

    /**
     * Prints offering message to the console
     */
    public void printWrongInputMessage() {print(bundle.getString(INPUT_WRONG));}
}
