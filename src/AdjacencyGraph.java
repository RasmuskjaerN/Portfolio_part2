import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class AdjacencyGraph {
    ArrayList<Vertex> vertices;
    public AdjacencyGraph(){
        vertices=new ArrayList<Vertex>();
    }
    public void addVertex(Vertex v){
        vertices.add(v);
    }
    public void addEdge(Vertex f,Vertex t, Integer w){
        if(!(vertices.contains(f) && vertices.contains(t)) ) {
            System.out.println(" Vertex not in graph");
            return;
        }
        Edge e=new Edge(f, t,w);
        Edge e2=new Edge(t,f,w);
    }

    public void MSTPrims() {
        MinHeap<Vertex> Q = new MinHeap<>();



        for (int i = 0; i < vertices.size(); i++) {
            Q.Insert(vertices.get(i));
            vertices.get(i).Distance = Integer.MAX_VALUE;
            vertices.get(i).Predecessor = null;
        }
        if (vertices.size() > 0)
            vertices.get(0).Distance = 0;
        int MST = 0;
        System.out.println("MST order\n");
        while (!Q.isEmpty()) {
            Vertex u = Q.extractMin();
            System.out.println(u.name);
            for (int i = 0; i < u.OutEdges.size(); i++) {
                Vertex v = u.getOutEdges().get(i).getTo();

                if (u.getOutEdges().get(i).getWeight()<v.Distance){
                    if(!v.explored){
                        v.Distance = u.getOutEdges().get(i).getWeight();
                        v.Predecessor = u;
                        int pos = Q.getPosition(v);
                        Q.decreasekey(pos);

                    }

                }
            }
            MST += u.Distance;
            u.explored = true;
        }

        int finalPrice = MST * 100000;
        System.out.println("Minimum Spanning Tree \n");
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).Predecessor != null)
                System.out.println("From Vertex: " + vertices.get(i).Predecessor.getName() + "\n To: " + vertices.get(i).getName() + " EdgeWeight: " + vertices.get(i).getDistance()+" km \n");
        }
        System.out.println("Weight of the MST is: "+MST+"km");
        System.out.println(finalPrice+" kr");
    }


    public  void PrintGraph(){
        for (int i=0;i<vertices.size();i++)
        {
            System.out.println("From Vertex: "+ vertices.get(i).name);
            Vertex currentfrom=vertices.get(i);
            for(int j=0; j<currentfrom.OutEdges.size();j++){
                Edge currentEdge=currentfrom.OutEdges.get(j);
                System.out.println(" To: "+ currentEdge.to.name + " weight: "+currentEdge.weight + " km ");
            }
            System.out.println(" ");
        }
    }
}



class Vertex implements Comparable<Vertex>{
    String name;
    ArrayList<Edge> OutEdges;
    Integer Distance= Integer.MAX_VALUE;
    Vertex Predecessor=null;
    boolean explored = false;



    public String getName() {
        return name;
    }

    public ArrayList<Edge> getOutEdges() {
        return OutEdges;
    }

    public Integer getDistance() {
        return Distance;
    }

    public Vertex getPredecessor() {
        return Predecessor;
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.Distance < o.Distance)
            return -1;
        if (this.Distance > o.Distance)
            return 1;

        return 0;
    }


    public Vertex(String id){
        name=id;
        OutEdges=new ArrayList<Edge>();
    }
    public void addOutEdge(Edge e) {
        OutEdges.add(e);
    }


}

class Edge{
    Integer weight;
    Vertex from;
    Vertex to;

    public Integer getWeight() {
        return weight;
    }

    public Vertex getFrom() {
        return from;
    }

    public Vertex getTo() {
        return to;
    }

    public Edge(Vertex from, Vertex to, Integer cost){
        this.from=from;
        this.to=to;
        this.weight=cost;
        this.from.addOutEdge(this);
    }
}
