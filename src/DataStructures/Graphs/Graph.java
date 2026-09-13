    package Graphs;

    import java.util.ArrayList;
    import java.util.Hashtable;

    public class Graph {
        int numberOfNode;
        Hashtable<Integer, ArrayList<Integer>> adjacentList;

        public Graph(){
            this.numberOfNode = 0;
            this.adjacentList = new Hashtable<>();
        }

        public void addVertex(int node){
            if(!adjacentList.containsKey(node)){
                adjacentList.put(node,new ArrayList<>());
                numberOfNode++;
            }
        }

        public void addEdge(int node, int edge){
            if(adjacentList.containsKey(node)  && adjacentList.containsKey(edge)) {
                this.adjacentList.get(node).add(edge);
                this.adjacentList.get(edge).add(node);
            }
        }
    }