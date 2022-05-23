import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Bass bass;
    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        bass = new Bass("wood", "black", "electric bass",
                500, 280, 4);
        piano = new Piano("wood", "brown", "Grand Piano",
                20000, 30000, 88);
        guitar = new Guitar("wood", "red", "electric",
                200, 300, 6);
        musicShop = new MusicShop();
    }

    @Test
    public void canGetArrayList(){
        musicShop.getStock().add(bass);
        musicShop.getStock().add(piano);
        musicShop.getStock().add(guitar);
        assertEquals(3, musicShop.getStock().size());
    }

//    @Test
//    public void canGetClass(){
//        assertEquals(class Piano, musicShop.getClassOfObject(piano));
//    }
}
