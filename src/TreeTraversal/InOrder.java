package TreeTraversal;
//using recursive approach;
import java.util.*;

import com.sun.source.tree.Tree;

public class InOrder {

    int data;
    InOrder left, right;

    InOrder(int data) {
        this.data = data;
        left = right = null;
    }

      class TreeTraversal {
        //inorder
        void inorder(InOrder root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        //creating tree node
        InOrder root = new InOrder(1);
        root.left= new InOrder(2);
        root.right = new InOrder(3);
        root.left.left = new InOrder(4);
        root.left.right = new InOrder(5);

        //create outer object
        InOrder obj = new InOrder(0);

        TreeTraversal tt = obj.new TreeTraversal();
        tt.inorder(root);
    }
}

