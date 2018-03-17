package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.Rectangle;
import ua.training.view.View;

import java.util.Scanner;

/**
 * <p>The <tt>Controller</tt> class provides controller view,
 * which takes processes the user input and sets model fields.
 * @author Roydgar
 * @version 1.0
 */
public class Controller {
    private Model model;
    private View view;
    private Scanner inputScanner = new Scanner(System.in);

    /**
     * Constructs a Controller with specified model and view.
     * @param model model object.
     * @param view view object.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    /**
     * Processes the user and sets model fields
     */
    public void processUser() {
        view.printInputWidthMessage();
        double width = getUserInput(inputScanner);
        view.printInputHeightMessage();
        double height = getUserInput(inputScanner);
        model.add(new Rectangle(width, height));
    }

    /**
     * Gets user information from the console.
     * @param inputScanner scanner uses to read the data from the console
     * @return double value representing valid user input.
     */
    private double getUserInput(Scanner inputScanner) {
        double inputValue;
        do {
            while (!inputScanner.hasNextDouble()) {
                view.printWrongInputMessage();
                inputScanner.next();
            }
            inputValue = inputScanner.nextDouble();

            if (inputValue <= 0) {
                view.printWrongInputMessage();
            }
        } while(inputValue <= 0);

        return inputValue;
    }
}
