package ua.training;

import org.junit.Assert;
import org.junit.Test;
import ua.training.model.Rectangle;

/**
 * <p>The <tt>RectangleTest</tt> class, represents test class for the rectangle
 * @author Roydgar
 * @version 1.0
 */
public class RectangleTest {
    private static final double DEFAULT_HEIGHT      = 1.25;
    private static final double DEFAULT_WIDTH       = 2.25;
    private static final double DEFAULT_AREA        = DEFAULT_HEIGHT * DEFAULT_WIDTH;
    private static final double DEFAULT_PERIMETER   = DEFAULT_HEIGHT + DEFAULT_WIDTH;
    private static final double WRONG_HEIGHT        = -1.25;
    private static final double WRONG_WIDTH         = -2.25;

    private Rectangle rectangle = new Rectangle(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    @Test(expected = IllegalArgumentException.class)
    public void testWrongRectangleArgument() {
        new Rectangle(WRONG_WIDTH, WRONG_HEIGHT);
    }

    @Test
    public void testConstructor() {
        Assert.assertTrue(rectangle.getWidth() == DEFAULT_WIDTH && rectangle.getHeight() == DEFAULT_HEIGHT);
    }

    @Test
    public void testArea() {
        Assert.assertTrue(Double.compare(rectangle.area(), DEFAULT_AREA) == 0);
    }

    @Test
    public void testPerimeter() {
        Assert.assertTrue(Double.compare(rectangle.perimeter(), DEFAULT_PERIMETER) == 0);
    }

    @Test
    public void testEquals() {
        Assert.assertTrue(rectangle.equals(new Rectangle(DEFAULT_WIDTH, DEFAULT_HEIGHT)));
        Assert.assertFalse(rectangle.equals(new Rectangle(DEFAULT_WIDTH + 1, DEFAULT_HEIGHT)));
    }

    @Test
    public void testClone() {
        Rectangle clone = rectangle.clone();
        Assert.assertTrue(clone != rectangle && clone.equals(rectangle)
                && clone.getClass() == rectangle.getClass());
    }
}
