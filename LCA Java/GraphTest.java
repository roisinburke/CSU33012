import static org.junit.Assert.*;
import org.junit.Test;
public class GraphTest {

    @Test
    public void testGraph()
    {
        Graph graph = new Graph(10);

        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(4, 6);
        graph.addEdge(4, 7);

        assertEquals(1, graph.inDegree(4));
        assertEquals(2, graph.outDegree(4));
        assertEquals(5, graph.E());
        assertEquals(10, graph.V());
        String expected = "[6, 7]";
        assertEquals(expected, graph.adj(4).toString());
    }

    @Test
    public void testAdj()
    {
        Graph graph = new Graph(5);

        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 3);
        graph.addEdge(4, 3);

        String expected = "[4]";
        assertEquals(expected, graph.adj(2).toString());
    }

    @Test
    public void addEdgeTest()
    {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(-2, -5);
        int expected = 1;
        assertEquals(expected, graph.E());

        expected = 2;
        graph.addEdge(1, 2);
        assertEquals(expected, graph.E());
    }

    @Test
    public void inDegreeTest()
    {
        Graph graph = new Graph(5);
        int expected = -1;
        assertEquals(expected, graph.inDegree(-3));
    }
    
    @Test
    public void outDegreeTest()
    {
        Graph graph = new Graph(5);
        int expected = -1;
        assertEquals(expected, graph.outDegree(8));
    }

    @Test
    public void nodeConstructorTest()
    {
        Node singleNode = new Node(1);
        assertNotNull(singleNode);
    }

    @Test
    public void emptyTreeTest()
    {
        LCA isTreeEmpty = new LCA();
        int expected = -1;
        assertEquals( expected,isTreeEmpty.findLCA(0, 0));

    }
}