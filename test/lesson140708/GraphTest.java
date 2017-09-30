package lesson140708;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {    //TDD Test Driven Development
    @Test
    public void testNewGraph(){
        Graph g = new Graph(4);
        assertEquals(4,g.vertices);

        Graph g2 = new Graph(10);
        assertEquals(10,g2.vertices);

        assertNotNull(g2.adjacencyLists);
        assertEquals(10,g2.adjacencyLists.size());
    }

    @Test
    public void testAddEdge() throws Exception{
        Graph g = new Graph(4);
        g.addEdge(0,1);
        assertEquals(1,g.edges());
        g.addEdge(1,2);
        assertEquals(2,g.edges());
    }

    @Test
    public void testAreConnected() throws Exception{
        Graph g = new Graph(4);
        g.addEdge(0,1);
        assertTrue(g.areConnected(0,1));
        assertFalse(g.areConnected(0,2));
    }
}