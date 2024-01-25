import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer, String, Float> boxOne = new Box<>(1, "Lada", 8.2f);
        Box<Integer, String, Float> boxTwo = new Box<>(2, "Volvo", 2.5f);
        float result = boxOne.getKey() + boxOne.getFlo() + boxTwo.getKey() + boxTwo.getFlo();
        assertEquals(13.7, result, 0.001);
    }
    //ываываыва
}