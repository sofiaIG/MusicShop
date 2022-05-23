import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "red", "electric",
                200, 300, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar", guitar.play());
    }

    @Test
    public void hasMarkUpPrice(){
        assertEquals(0.5, guitar.calculateMarkUp(),0.0);
    }
}
