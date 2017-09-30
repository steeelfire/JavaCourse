package lesson140710;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TermostatTest {

    Termostat term = new Termostat();;

    @Test
    public void testDefaultTemperature(){
        assertEquals(20,term.temperature);
    }

    @Test
    public void testHasListener(){
        assertNull(term.listener);
//        term.setListener(new TermListener(){
//
//        });
        assertNotNull(term.listener);
    }

    @Test
    public void testInc(){
        term.inc();
        assertEquals(21,term.temperature);
    }
}