import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PointTest {
    @Test
    public void testPoint() {
        Point point = new Point(3, 5);
        String expected = "(3.0, 5.0)";
        String result = point.toString();

        assertEquals(expected, result);
    }

    @Test
    public void testMovable() {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        MovablePoint expected = new MovablePoint(4, 6);
        MovablePoint result = movablePoint.move();

        assertEquals(expected.toString(), result.toString());
    }
}
