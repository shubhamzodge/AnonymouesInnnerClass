package TreeTraversal;
import java.util.*;

//using iterative approach :stack

   class Node{
       int data;
       Node left,right;
       Node(int data){
           this.data = data;
           left = right = null;
       }
   }
   public class Inorder2{
       public static void inorder(Node root) {
           Stack<Node> stack = new Stack<>();
           Node curr = root;
           while (curr != null || !stack.isEmpty())
               while (curr != null) {
                   stack.push(curr);
                   curr = curr.left;
               }
           curr = stack.pop();
           System.out.println(curr.data +" ");
           curr = curr.right;
       }
       }


