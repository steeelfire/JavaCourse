package tetris;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldTest {

    @Test
    public void test(){
        assertEquals(20,Field.HEIGHT);
    }

}