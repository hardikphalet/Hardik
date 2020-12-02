class App{
    public static void main(String args[]) {
        Graph<Integer> g = new Graph<Integer>();
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(4,5);
        g.addEdge(4,6);
        g.addEdge(2,7);
        g.addEdge(2,8);
        g.addEdge(2,9);
        g.addEdge(3,10);
        System.out.println("Graph: \n"+g.toString());
        g.getVertexCount();
        g.getEdgesCount(true);
        g.getEdgesCount(false);
        g.hasEdge(3, 8);
        g.hasEdge(2, 7);
        g.hasVertex(12);
        g.hasVertex(3);
    }
}