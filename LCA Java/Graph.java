import java.util.ArrayList;

public class Graph {
    private int V;						//no. vertices
    private int E;						//no. edges
    private ArrayList<Integer>[] adj;   //adj[V] = adjacency list for vertex V
    private int [] indegree;			//indegree[V] = indegree of vertex V
    private int [] outdegree;			//outdegree[V] = outdegree of vertex V
    private boolean marked [];			//list of visited vertices
    private boolean hasCycle;			//True if graph has cycle
    private boolean stack [];			//


    public Graph(int V)
    {
        if(V < 0)
        {
            throw new IllegalArgumentException("Number of vertices must be greater than 0");
        }

        this.V = V;
        this.E = 0;
        indegree = new int[V];
        marked = new boolean[V];
        stack = new boolean[V];
        adj = (ArrayList<Integer>[]) new ArrayList[V];

        for(int v = 0; v < V; v++)
        {
            adj[v] = new ArrayList<Integer>();
        }
    }
    
    public int V()
    {
        return V;
    }

    public int E()
    {
        return E;
    }

}
