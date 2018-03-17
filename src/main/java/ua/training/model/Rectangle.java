package ua.training.model;

import java.io.Serializable;

/**
 * <p>The <tt>Rectangle</tt> class, represents rectangle with width and height.
 * @author Roydgar
 * @version 1.0
 */

public class Rectangle implements Serializable, Cloneable{

    private double width;
    private double height;

    private static final long serialVersionUID = -8796824158469421777L;

    /**
     * Constructs a rectangle with width and height equals to zero.
     */
    public Rectangle() {
        width = height = 0.0;
    }

    /**
     * Constructs a rectangle with specified width and height.
     * @throws IllegalArgumentException if the specified parameters
     *         are negative
     * @param width rectangle width.
     * @param height rectangle height.
     */
    public Rectangle(double width, double height) {
        setSize(width, height);
    }

    /**
     * Constructs a rectangle using existing Rectangle object.
     * @throws IllegalArgumentException if the specified parameters
     *         are negative
     * @param rectangle rectangle object.
     */
    public Rectangle(Rectangle rectangle) {
        setSize(rectangle.width, rectangle.height);
    }

    /**
     * Sets rectangle size.
     * @throws IllegalArgumentException if the specified parameters
     *         are negative
     * @param width rectangle width.
     * @param height rectangle height.
     */
    public void setSize(double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("Negative argument: " +
                    "width = " + width + "; height = " + height );
        this.width  = width;
        this.height = height;
    }

    /**
     * Returns rectangle width.
     * @return rectangle width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns rectangle height.
     * @return rectangle height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates rectangle area.
     * @return rectangle area
     */
    public double area() { return width * height; }

    /**
     * Calculates rectangle perimeter.
     * @return rectangle perimeter.
     */
    public double perimeter() { return width + height; }

    /**
     * Rectangle String representation.
     * @return String rectangle representation.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [width = " + width + ", height = " + height + "]";
    }

    /**
     * Checks whether two rectangles are equal.
     * <p>
     * The result is <code>true</code> if and only if the argument is not
     * <code>null</code> and is a <code>Rectangle</code> object that has the
     * same upper-left corner, width, and height as
     * this <code>Rectangle</code>.
     * @param obj the <code>Object</code> to compare with
     *                this <code>Rectangle</code>
     * @return    <code>true</code> if the objects are equal;
     *            <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Rectangle rect = (Rectangle)obj;

        if (Double.compare(width, rect.width) == 0 && Double.compare(height, rect.height) == 0)
            return true;
        else
            return false;
    }

    /**
     * Returns a hash code value for the object.
     * @return  a hash code value for this object.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(width);
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    /**
     * returns copy (clone) of this object.
     * @return Rectangle object, which is clone of current object.
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
