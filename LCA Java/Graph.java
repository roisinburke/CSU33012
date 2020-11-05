import java.util.ArrayList;

public class Graph {

    private int V;						//no. vertices
    private int E;						//no. edges
    private ArrayList<Integer>[] adj;   //adj[V] = adjacency list for vertex V
    private int [] indegree;			//indegree[V] = indegree of vertex V

    public Graph(int V)
    {
        if(V < 0)
        {
            throw new IllegalArgumentException("Number of vertices must be greater than 0");
        }

        this.V = V;
        this.E = 0;
        indegree = new int[V];
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

    public void addEdge(int v, int w)
    {
        if((validateVertex(v) > 0) && (validateVertex(w) > 0))
        {
            adj[v].add(w);
            indegree[w]++;
            E++;
        }
        else
        {
            System.out.println("Enter numbers between 0 and " + (V-1));
        }
    }

    private int validateVertex(int v)
    {
        if(v < 0 || v >= V)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public int inDegree(int v)
    {
        if(validateVertex(v) > 0)
        {
            return indegree[v];
        }
        else
        {
            return -1;
        }

    }

    public int outDegree(int v)
    {
        if(validateVertex(v) > 0)
        {
            return adj[v].size();
        }
        else
        {
            return -1;
        }
    }

    public Iterable<Integer> adj(int v)
    {
        return adj[v];
    }
}
