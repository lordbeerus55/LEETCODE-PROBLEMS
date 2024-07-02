/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
       List<Double> answer = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       if(root == null){
        return answer;
       } 
       q.add(root);

       while(!q.isEmpty()){
        int size = q.size();
        double average = 0;
        for(int i = 0 ; i<size;i++){
           TreeNode current = q.remove();
           average+=current.val;
           if(current.left!=null){
            q.add(current.left);
           }
           if(current.right!=null){
            q.add(current.right);
           }
        }
        average=average/size;
        answer.add(average);
       }
       return answer;
    }
}