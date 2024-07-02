/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int mindepth=0;
        if(root==null){
            return 0;

        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            mindepth++;
            for(int i = 0 ; i<size;i++){
                TreeNode current = q.remove();
                if(current.left==null && current.right==null){
                return mindepth;
            }
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
            }
            
        }
        return mindepth;
    }
}