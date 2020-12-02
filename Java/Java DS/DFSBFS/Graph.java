import java.util.*;
public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();
    public void addVertex(T s){
        map.put(s, new LinkedList<T>());
    } 
    public void addEdge(T source, T destination, boolean biDirectional){
        if (!map.containsKey(source)){
            addVertex(source);
        }
        if (!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if (biDirectional==true){
            map.get(destination).add(source);
        }
    }
    public void addEdge(T source, T destination){
        if (!map.containsKey(source)){
            addVertex(source);
        }
        if (!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
    }
    public void getVertexCount(){
        System.out.println("The graph has "+map.keySet().size()+" vertex.");
    }

    public void getEdgesCount(boolean biDirection){
        int count = 0;
        for (T v : map.keySet()){
            count+=map.get(v).size();
        }
        if (biDirection == true){
            count /= 2;
        }
        System.out.println("The graph has "+count+" edges");
    }
    public void hasVertex(T s){
        if (map.containsKey(s)){
            System.out.println("The graph has "+s+" as a vertex");
        } else {
            System.out.println("The graph does not have "+s+" as a vertex");
        }
    }
    public void hasEdge(T s, T d){
        if (map.get(s).contains(d)){
            System.out.println("The graph has an edge between "+s+" and "+d+".");
        } else {
            System.out.println("The graph has no edge between "+s+" and "+d+".");
        }
    }
    @Override 
    public String toString(){
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()){
            builder.append(v.toString()+": ");
            for (T w: map.get(v)){
                builder.append(w.toString()+ " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}