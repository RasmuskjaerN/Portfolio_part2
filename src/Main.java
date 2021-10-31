public class Main {

    public static void main(String[] args) {
	// write your code here
        AdjacencyGraph adjgraph=new AdjacencyGraph();
        Vertex E=new Vertex("Eskildstrup");
        adjgraph.addVertex(E);
        Vertex H= new Vertex("Haslev");
        adjgraph.addVertex(H);
        Vertex Ho= new Vertex(("Holbæk"));
        adjgraph.addVertex(Ho);
        Vertex J= new Vertex("Jægerpris");
        adjgraph.addVertex(J);
        Vertex K=new Vertex("Kalundborg");
        adjgraph.addVertex(K);
        Vertex Ko= new Vertex(("Korsør"));
        adjgraph.addVertex(Ko);
        Vertex Kø= new Vertex("Køge");
        adjgraph.addVertex(Kø);
        Vertex M= new Vertex("Maribo");
        adjgraph.addVertex(M);
        Vertex N= new Vertex("Næstved");
        adjgraph.addVertex(N);
        Vertex R= new Vertex("Ringsted");
        adjgraph.addVertex(R);
        Vertex S= new Vertex("Slagelse");
        adjgraph.addVertex(S);
        Vertex NF= new Vertex("Nykøbing F");
        adjgraph.addVertex(NF);
        Vertex V= new Vertex("Vordingborg");
        adjgraph.addVertex(V);
        Vertex Ro= new Vertex("Roskilde");
        adjgraph.addVertex(Ro);
        Vertex So= new Vertex("Sorø");
        adjgraph.addVertex(So);
        Vertex Na= new Vertex("Nakskov");
        adjgraph.addVertex(Na);

        adjgraph.addEdge(E,M,28);
        adjgraph.addEdge(E,NF,13);
        adjgraph.addEdge(E,V,25);

        adjgraph.addEdge(H,Ko,60);
        adjgraph.addEdge(H ,Kø,24);
        adjgraph.addEdge(H,N,25);
        adjgraph.addEdge(H,R,19);
        adjgraph.addEdge(H,Ro,47);
        adjgraph.addEdge(H,S,48);
        adjgraph.addEdge(H,So,34);
        adjgraph.addEdge(H,V,40);

        adjgraph.addEdge(Ho,J,34);
        adjgraph.addEdge(Ho,K,44);
        adjgraph.addEdge(Ho,Ko,66);
        adjgraph.addEdge(Ho,R,36);
        adjgraph.addEdge(Ho,Ro,32);
        adjgraph.addEdge(Ho,S,46);
        adjgraph.addEdge(Ho,So,34);

        adjgraph.addEdge(J,Ko,94);
        adjgraph.addEdge(J,Kø,58);
        adjgraph.addEdge(J,R,56);
        adjgraph.addEdge(J,Ro,33);
        adjgraph.addEdge(J,S,74);
        adjgraph.addEdge(J,So,63);


        adjgraph.addEdge(K,R,62);
        adjgraph.addEdge(K,Ro,70);
        adjgraph.addEdge(K,S,39);
        adjgraph.addEdge(K,So,51);

        adjgraph.addEdge(Ko,N,45);
        adjgraph.addEdge(Ko,S,20);

        adjgraph.addEdge(Kø,N,45);
        adjgraph.addEdge(Kø,R,28);
        adjgraph.addEdge(Kø,Ro,25);
        adjgraph.addEdge(Kø,V,60);

        adjgraph.addEdge(M,Na,27);
        adjgraph.addEdge(M,NF,26);

        adjgraph.addEdge(N,Ro,57);
        adjgraph.addEdge(N,R,26);
        adjgraph.addEdge(N,S,37);
        adjgraph.addEdge(N,So,32);
        adjgraph.addEdge(N,V,28);

        adjgraph.addEdge(R,Ro,31);
        adjgraph.addEdge(R,So,15);
        adjgraph.addEdge(R,V,58);

        adjgraph.addEdge(S,So,14);




        adjgraph.PrintGraph();
        adjgraph.MSTPrims();
    }
}
