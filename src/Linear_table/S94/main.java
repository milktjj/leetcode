package Linear_table.S94;

import Linear_table.Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class main {
    /* public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         if (root != null)
             inorderTravel(list,root);
         return list;
     }

     public void inorderTravel(List<Integer> node, TreeNode root) {
         if (root != null)
             node.add(root.val);
         if(root.left != null)
             inorderTravel(node,root.left);
         if (root.right != null)
         inorderTravel(node, root.right);

     }*/
    public static  List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> node = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        if (root != null)
            stack.push(root);
        TreeNode tmp;

        while (!stack.empty()) {
            while (stack.peek().left != null)
                stack.push(stack.peek().left);
            node.add(stack.peek().val);
            tmp = stack.pop();
            if (tmp.right != null) {
                stack.push(tmp.right);
            } else {
                while(!stack.empty()) {
                    node.add(stack.peek().val);
                    tmp = stack.pop();
                    if(tmp.right != null) {
                        stack.push(tmp.right);
                        break;
                    }
                }
            }


           /* node.add(tmp.val);
            if (!stack.empty()) {
                tmp = stack.pop();
                node.add(tmp.val);
                if (tmp.right != null) {
                    stack.push(tmp.right);
                }
            }
*/

        }
        return node;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        inorderTraversal(root);

    }
}