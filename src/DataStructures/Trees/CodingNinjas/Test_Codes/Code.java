package DataStructures.Trees.CodingNinjas.Test_Codes;

public class Code {
}



// printDFS tree using stack
//public class Solution {
//    public List < Integer > inorderTraversal(TreeNode root) {
//        List < Integer > res = new ArrayList < > ();
//        Stack < TreeNode > stack = new Stack < > ();
//        TreeNode curr = root;
//        while (curr != null || !stack.isEmpty()) {
//            while (curr != null) {
//                stack.push(curr);
//                curr = curr.left;
//            }
//            curr = stack.pop();
//            res.add(curr.val);
//            curr = curr.right;
//        }
//        return res;
//    }
//}