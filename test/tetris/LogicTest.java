package tetris;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LogicTest {

    private Logic _logic;

    @Before
    public void setup(){
        State state = new State();
        _logic = new Logic(state);

    }
    @Test
    public void testKnowsState(){
        assertNotNull(_logic.state);
    }
    @Test
    public void demoLogicInterface() throws Exception{
        _logic.moveLeft();
        _logic.moveRight();
        _logic.rotate();
        _logic.dropDown();
        _logic.slideDownOneRow();
    }
    @Test
    public void testMoveLeft() throws Exception{
        int column = _logic.state.figureColumn;
        _logic.moveLeft();
        assertEquals(column - 1, _logic.state.figureColumn);
    }

    @Test
    public void testNotMoveTooLeft() throws Exception{
        _logic.state.figureColumn = 0;  //Fixture
        _logic.moveLeft();              //
        assertEquals(0, _logic.state.figureColumn); //Assertion
    }
}
