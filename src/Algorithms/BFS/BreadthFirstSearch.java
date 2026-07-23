package Algorithms.BFS;

import Trees.BinarySearchTree;
import Trees.Binary_Search_Tree_Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    static BinarySearchTreeNode root = null;

    public static void Insert(int value) {
        BinarySearchTreeNode newNode = new BinarySearchTreeNode(value);
        if (root == null) {
            root = newNode;
            return;
        } else {
            BinarySearchTreeNode current = root;
            while (true) {
                //left Side
                if (value < current.value) {
                    if (current.left == null) {
                        current.left = newNode;
                        return;
                    }
                    current = current.left;
                } else {
                    //Right Side
                    if (current.right == null) {
                        current.right = newNode;
                        return;
                    }
                    current = current.right;
                }
            }
        }
    }

    public static BinarySearchTreeNode lookUp(int value) {
        if (root == null) {
            return null;
        }

        BinarySearchTreeNode current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }

    public boolean remove(int value) {
        //first check if the tree if empty
        if (this.root == null) {
            return false;
        }
        //create current node to travel on it and the save the parent
        BinarySearchTreeNode currentNode = root;
        BinarySearchTreeNode parent = null;
        //check the rule to save more time complexity
        while (currentNode != null) {
            if (value < currentNode.value) {
                //left
                parent = currentNode;
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                //right
                parent = currentNode;
                currentNode = currentNode.right;
            } else {
                if (currentNode.right == null) {
                    if (parent == null) {
                        this.root = currentNode.left;
                    } else {

                        //if parent > current value, make current left child a child of parent
                        if (currentNode.value < parent.value) {
                            parent.left = currentNode.left;
                            // if parent < current value, make left child a right child of parent
                        } else {
                            parent.right = currentNode.left;
                        }
                    }
                } else if (currentNode.right.left == null) {
                    if (parent == null) {
                        this.root = currentNode.left;
                    } else {
                        currentNode.right.left = currentNode.left;

                        //if parent > current, make right child of the left the parent
                        if (currentNode.value < parent.value) {
                            parent.left = currentNode.right;
                            // if parent < current , make right child a right child of the parent
                        } else {
                            parent.right = currentNode.right;
                        }
                    }
                } else {
                    //find the right child's left most child
                    BinarySearchTreeNode leftMost = currentNode.right.left;
                    BinarySearchTreeNode leftMostParent = currentNode.right;
                    while (leftMost.left != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.left;
                    }
                    // Parent's left subtree is now leftmost's right subtree
                    leftMostParent.left = leftMost.right;
                    leftMost.left = currentNode.left;
                    leftMost.right = currentNode.right;

                    if (parent == null) {
                        this.root = leftMost;
                    } else {
                        if (currentNode.value < parent.value) {
                            parent.left = leftMost;
                        } else {
                            parent.right = leftMost;
                        }
                    }
                }
                return true;
            }
        }
        return true;
    }

    //Breadth First Search Function
    public static ArrayList breadthFirstSearch() {
        //first check if the tree is empty or not
        if (root == null) {
            return null;
        }


        //also the list that have the BFS data
        ArrayList<Object> BFSList = new ArrayList<>();
        //and the queue that will put the nodes and shifting on it
        Queue<BinarySearchTreeNode> BFSQueue = new LinkedList<>();
        BFSQueue.add(root);

        while (!BFSQueue.isEmpty()) {
            BinarySearchTreeNode currentNode = BFSQueue.poll();
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
    public static ArrayList breadthFirstSearchRecursion( Queue<BinarySearchTreeNode> BFSQueue ,ArrayList<Object> BFSList ) {
        //first check if the tree is empty or not
        if (root == null) {
            return new ArrayList<>();
        }

        if (BFSQueue.isEmpty()) {
            return BFSList;
        }

        BinarySearchTreeNode currentNode = BFSQueue.poll();
        BFSList.add(currentNode.value);
        if (currentNode.left != null) {
            BFSQueue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            BFSQueue.add(currentNode.right);
        }

        return breadthFirstSearchRecursion(BFSQueue,BFSList);
    }

}

