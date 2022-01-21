package projectds1;
import java.util.Scanner;
public class ProjectDS1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the redundenct ratio greater than 1");
        double My_Ratio = S.nextDouble();
        double Count = 1;
        double Ratio;
        System.out.println("Enter Number... ");
        int X=S.nextInt();
        BST B = new BST();
        Node root=B.insertion(B.root, X);
        do {
            System.out.println("Enter Number... ");
            X = S.nextInt();
            if (!B.search(root, X)&&X!=-1);{
            B.insertion(root, X);     }
            Count++;
            double Number_of_Node = B.count(root);
            Ratio = Count/Number_of_Node;
        } while ( Ratio < My_Ratio&&X!=-1);
        if (Ratio >= My_Ratio) {
            System.out.println("Ratio = " + Ratio + " \n" + "Many Repetitions");
        } else {
            System.out.println("Ratio = " + Ratio + " \n" + "Few Repetitions");     }  }}
class Node {
    Node left;
    Node right;
    int data;
public  Node(int data) {
      this.data = data;
      left=null;
      right=null; 
    }}
class BST {
  Node root;
    public Node insertion(Node root, int key) {
        if (root== null) {
            root = new Node(key);    }
        if (key > root.data) {
            root.right = insertion(root.right,key);           
        } else if (key < root.data) {
             root.left = insertion(root.left,key);     }
        return root; }
    public int count(Node root) {
        if (root == null) {
            return 0;}      
            return count(root.left) + count(root.right) + 1; }
    public boolean search(Node root, int key) {
        while (root != null) { 
            if (key > root.data) 
                root = root.right; 
            else if (key < root.data) 
                root = root.left; 
            else
                return true;
        } 
        return false;   }}
