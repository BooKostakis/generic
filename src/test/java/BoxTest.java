import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box = new Box<>(5, 7, 9, 12, 2);
        Box<Float> box2 = new Box<>(7f, 5f, 9f, 12f, 2f);
        assertEquals(7, box.avg(), 0.001);
        assertEquals(0, box.compare(box2));
    }
    @Test
    public void testBoxTwo() {
        List<Integer> numbers = new ArrayList<>();
        Box.method(numbers);
    }
}

