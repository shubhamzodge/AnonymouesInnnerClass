package TreeTraversal;
//using recursive approach
public class Preorder {
    int data;
    Preorder left, right;

    Preorder(int value) {
        data = value;
        left = right = null;
    }

    public class preOrderTraversal {
        public static void pre(Node root) {
            if(root == null){
                return ;
            }
            //visit root
            System.out.print(root.data+" ");
            //traverse left
            pre(root.left);
            //traverse right
            pre(root.right);
        }
    }
}