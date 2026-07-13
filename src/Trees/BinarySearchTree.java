package Trees;

public class BinarySearchTree {
    Binary_Search_Tree_Node root = null;

    //Insert function
    public void insert(int value) {
        //create the new node that need to put in tree
        Binary_Search_Tree_Node newNode = new Binary_Search_Tree_Node(value);

        //check if the tree is empty if true will add the root = the new node
        if (this.root == null) {
            this.root = newNode;
            return;
        } else {
            //will check if the new node is grater or less than the current and use the rule of the tree
            Binary_Search_Tree_Node currentNode = this.root;
            while (true) {
                //left
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    //right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    //LookUp(Search) Function
    public Binary_Search_Tree_Node lookUp(int value) {
        //first check if the tree if empty
        if (this.root == null) {
            return null;
        }
        //create current node to travel on it
        Binary_Search_Tree_Node currentNode = this.root;
        //check the rule to save more time complexity
        while (currentNode != null) {
            if (value < currentNode.value) {
                //left
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                //right
                currentNode = currentNode.right;
            } else {
                return currentNode;
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
        Binary_Search_Tree_Node currentNode = this.root;
        Binary_Search_Tree_Node parent = null;
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
                    if(parent == null){
                        this.root = currentNode.left;
                    }else{
                        currentNode.right.left = currentNode.left;

                        //if parent > current, make right child of the left the parent
                        if(currentNode.value < parent.value){
                            parent.left = currentNode.right;
                        // if parent < current , make right child a right child of the parent
                        }else{
                            parent.right = currentNode.right;
                        }
                    }
                }else{
                    //find the right child's left most child
                    Binary_Search_Tree_Node leftMost = currentNode.right.left;
                    Binary_Search_Tree_Node leftMostParent = currentNode.right;
                    while (leftMost.left != null){
                        leftMostParent = leftMost;
                        leftMost = leftMost.left;
                    }
                    // Parent's left subtree is now leftmost's right subtree
                    leftMostParent.left = leftMost.right;
                    leftMost.left = currentNode.left;
                    leftMost.right = currentNode.right;

                    if(parent == null){
                        this.root = leftMost;
                    }else{
                        if(currentNode.value < parent.value){
                            parent.left = leftMost;
                        }else{
                            parent.right = leftMost;
                        }
                    }
                }
                return true;
            }
        }
        return true;
    }
}
