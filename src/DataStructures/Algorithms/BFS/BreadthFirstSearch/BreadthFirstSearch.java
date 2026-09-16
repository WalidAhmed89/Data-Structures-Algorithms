package DataStructures.Algorithms.BFS.BreadthFirstSearch;





import DataStructures.Trees.BinarySearchTree.BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//        9
//   4        20
// 1   6   15    170

public class BreadthFirstSearch {
    static BinarySearchTree root = null;

    //Breadth First Search Function
    public static ArrayList breadthFirstSearch() {
        //first check if the tree is empty or not
        if (root == null) {
            return null;
        }


        //also the list that have the BFS data
        ArrayList<Object> BFSList = new ArrayList<>();
        //and the queue that will put the nodes and shifting on it
        Queue<BinarySearchTree> BFSQueue = new LinkedList<>();
        BFSQueue.add(root);

        while (!BFSQueue.isEmpty()) {
            BinarySearchTree currentNode = BFSQueue.poll();
            BFSList.add(currentNode.value);
            if (currentNode.left != null) {
                BFSQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                BFSQueue.add(currentNode.right);
            }
        }
        return BFSList;
    }

    //Breadth First Search Function Recursion
    public static ArrayList breadthFirstSearchRecursion(Queue<BinarySearchTree> BFSQueue, ArrayList<Object> BFSList) {
        //first check if the tree is empty or not
        if (root == null) {
            return new ArrayList<>();
        }

        if (BFSQueue.isEmpty()) {
            return BFSList;
        }

        BinarySearchTree currentNode = BFSQueue.poll();
        BFSList.add(currentNode.value);
        if (currentNode.left != null) {
            BFSQueue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            BFSQueue.add(currentNode.right);
        }

        return breadthFirstSearchRecursion(BFSQueue, BFSList);
    }
}
