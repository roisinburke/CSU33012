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
        String adj = "[6, 7]";
        assertEquals(adj, graph.adj(4).toString());
    }
}