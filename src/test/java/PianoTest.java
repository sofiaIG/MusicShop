import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "brown", "Grand Piano",
                20000, 30000, 88);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("Piano", piano.play());
    }

}
