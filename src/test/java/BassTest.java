import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before(){
        bass = new Bass("wood", "black", "electric bass",
                500, 280, 4);

    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", bass.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", bass.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("electric bass", bass.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(4, bass.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Bass", bass.play());
    }


    }



