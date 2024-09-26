import java.util.ArrayList;

public class BST{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    // no duplicates

    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    // inOrder traversal

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // search of key

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data < key){
            return search(root.right, key);
        }
        else{
            return true;
        }
    }

    public static Node delete(Node root, int value){
        if(root.data > value){
            root.left = delete(root.left, value);
        }
        else if(root.data < value){
            root.right = delete(root.right, value);
        }
        else{ // root.data == value
            //case 1(deleting leaf node i.e no child)
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2(deleting node with one child)
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3(deleting node with many childs)
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            // leaf node
            printPath(path);
        }
        else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};  
        Node root = null; 

        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        System.out.println("searching...");

        if(search(root, 11)){
            System.out.println("found!");
        }
        else{
            System.out.println("not found");
        }
        
        System.out.println("inorder traversal");

        inOrder(root);
        System.out.println();

        System.out.println("inorder traversal after deleting");

        delete(root, 10);
        inOrder(root);
        System.out.println();

        System.out.println("print values of binary tree in given range ");

        printInRange(root, 3, 11);
        System.out.println();

        System.out.println("all apths are ...s");
        printRoot2Leaf(root, new ArrayList<>());

    }
}