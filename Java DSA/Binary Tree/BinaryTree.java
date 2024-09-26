//Build a Tree from its preOrder traversal

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;
 
 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
 
    static class Btree {
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            System.out.print("-1"+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            System.out.print("-1"+" ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            System.out.print("-1"+" ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

        }

    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftHeight, rightheight)+1; 
    }

    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);
        return left+right+1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left+right+root.data;
    }

    // diameter (approach) => O(n^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = height(root.left)+height(root.right)+1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);
        return Math.max(Math.max(diam3, diam2), diam1);
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int height, int diameter){
            this.ht = height;
            this.diam = diameter;
        }
    }

    public static TreeInfo allData(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = allData(root.left);
        TreeInfo right = allData(root.right);

        int myHeight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }
    
    public boolean isSubtree(Node root, Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subroot)){
            return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    } 


    public static int sumOfNodesAtKthLevel(Node root, int k){
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int sum = 0;
        int flag = 0;


        while(!q.isEmpty()){

            int size = q.size();

            while (size-- >0)
        {
            Node curr = q.remove();

            if(level == k){
                flag = 1;
                sum = sum + curr.data;
            }

            else{
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
            level++;
            if(flag == 1){
                break;
            }
        }
    return sum;
}



    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Btree tree = new Btree();
       
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("preOrder");
        preOrder(root);
        System.out.println();
        System.out.println("inOrder");
        inOrder(root);
        System.out.println();
        System.out.println("postOrder");
        postOrder(root);
        System.out.println();
        System.out.println("levelOrder");
        BinaryTree bt = new BinaryTree();
        bt.levelOrder(root);
        System.out.println();
        System.out.println("height of tree");
        System.out.println(height(root));
        System.out.println();
        System.out.println("total number of nodes");
        System.out.println(countOfNodes(root));
        System.out.println();
        System.out.println("sum of nodes");
        System.out.println(sumOfNodes(root));
        System.out.println();
        System.out.println("diameter using O(n^2) time complexity");
        System.out.println(diameter(root));
        System.out.println();
        System.out.println("diameter using O(n) time complexity");
        System.out.println(allData(root).diam);
        System.out.println("height of tree with diameter");
        System.out.println(allData(root).ht);
        System.out.println("subtree sum ");
        System.out.println(sumOfNodesAtKthLevel(root, 1));
    }
}
