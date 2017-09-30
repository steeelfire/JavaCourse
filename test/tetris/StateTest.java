package tetris;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StateTest {

    private State _state;

    @Before
    public void setup() {
        _state = new State();
    }

    @Test
    public void testHasField() {
        assertNotNull(_state.field);
        assertTrue(_state.field instanceof Field);
    }

    @Test
    public void testHasFigure() throws Exception {
        assertNotNull(_state.figure);
    }

    @Test
    public void testFigureLocation() throws Exception {
        assertEquals(0,_state.figureRow);
        int column = _state.field.box[0].length / 2 -
                _state.figure.data[0].length / 2 + 1;
        assertEquals(column,_state.figureColumn);
    }
}