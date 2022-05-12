package dataStructure.hard.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**directed and undirected will have same code representation but only the assigning of vertex and directions will
 * Change only*/
public class Graph<T> {
    public Map<T, List<T>> map = new HashMap<>();
    public void addvertex(T s){
        map.put(s, new LinkedList<T>());
    }
    public void addEdge( T source , T destination , boolean bidirectional){
        if(!map.containsKey(source)) addvertex(source) ;
        if(!map.containsKey(destination)) addvertex(destination) ;
        map.get(source).add(destination);
        if(bidirectional) map.get(destination).add(source);
    }
    public int getVertexCount(){
        return map.keySet().size();
    }
    public void getEdgeCount( boolean biderec){
        int count = 0;
        for(T v:map.keySet()){
            count+=map.get(v).size();
        }
        if(biderec) count=count/2;
        System.out.println(count);
    }
    public void hasEdge(T s , T d){
        if(map.get(s).contains(d)){
            System.out.println("yes");
        }
    }
    public String toString(){
     StringBuilder builder =  new StringBuilder();
     for( T v:map.keySet()){
         builder.append(v.toString()).append(":");
         for(T w: map.get(v)){
             builder.append(w.toString()).append(" ");
         }
         builder.append("\n");
     }
     return builder.toString();
    }
    public void delEdge( T u , T v){
        List<T> u1 =map.get(u);
        List<T> v1 =map.get(v);
        for( int i = 0; i<u1.size();i++){
            if(u1.get(i)==v){
                u1.remove(i);
                break;
            }
        }
        for( int i = 0; i<v1.size();i++){
            if(v1.get(i)==u){
                v1.remove(i);
                break;
            }
        }

    }
}
