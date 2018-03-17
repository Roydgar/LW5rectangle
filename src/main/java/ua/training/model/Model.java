package ua.training.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>The <tt>Model</tt> class provides model view.
 * which manages data.
 * @author Roydgar
 * @version 1.0
 */
public class Model {
    private List<Rectangle> rectangles = new ArrayList<>();

    /**
     * Adds data to the model.
     * @param rect Rectangle object to pass in the model.
     */
    public void add(Rectangle rect) { rectangles.add(rect); }

    /**
     * Returns model data.
     * @return List of Rectangle objects containing in the model.
     */
    public List<Rectangle> getData() { return rectangles; }
}
