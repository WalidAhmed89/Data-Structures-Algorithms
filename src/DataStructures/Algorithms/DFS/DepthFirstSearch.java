package DataStructures.Algorithms.DFS;



import DataStructures.Trees.BinarySearchTree;

import java.util.ArrayList;

//        9
//   4        20
// 1   6   15    170

public class DepthFirstSearch {
    static BinarySearchTree root = null;

    //in order the list will be[1,4,6,9,15,20,170]
    ArrayList<Integer> DFSInOrder() {
        return traverseInOrder(root, new ArrayList<>());
    }

    //in order the list will be[1,6,4,15,170,20,9]
    ArrayList<Integer> DFSPostorder() {
        return traversePostorderr(root, new ArrayList<>());
    }

    //in order the list will be[9,4,1,6,20,15,170]
    ArrayList<Integer> DFSPreorder() {
        return traversePreorder(root, new ArrayList<>());
    }

    //in this Traverse we need to go all away down to the left and traverse on it
    public ArrayList<Integer> traverseInOrder(BinarySearchTree node, ArrayList<Integer> list) {
        if (node.left != null) {
            traverseInOrder(node.left, list);
        }

        list.add(node.left.value);

        if (node.right != null) {
            traverseInOrder(node.right, list);
        }

        return list;
    }

    //in this Traverse we need to go all away down to the left and right to traverse on it [1,6,4,15,170,20,9]
    public ArrayList<Integer> traversePostorderr(BinarySearchTree node, ArrayList<Integer> list) {
        if (node.left != null) {
            traversePostorderr(node.left, list);
        }

        if (node.right != null) {
            traversePostorderr(node.right, list);
        }

        list.add(node.left.value);

        return list;
    }

    //in this Traverse we need to go from the root to all away down to the left and traverse on it [9,4,1,6,20,15,170]
    public ArrayList<Integer> traversePreorder(BinarySearchTree node, ArrayList<Integer> list) {
        list.add(node.left.value);
        if (node.left != null) {
            traversePreorder(node.left, list);
        }
        if (node.right != null) {
            traversePreorder(node.right, list);
        }


        return list;
    }


}
