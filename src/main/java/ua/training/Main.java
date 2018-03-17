package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.view.View;

/**
 * <p>The <tt>Main</tt> class represents the start point of the program
 * @author Roydgar
 * @version 1.0
 */

public class Main {
    public static void main( String[] args ) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
