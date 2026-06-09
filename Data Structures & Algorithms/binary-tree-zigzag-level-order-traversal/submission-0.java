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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root == null ) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<List<Integer>> ans = new ArrayList<>();
         
         int level = 0;

        while(!q.isEmpty()){
            int sz = q.size();
             
              List<Integer> levellist = new ArrayList<>();

            for(int i=0; i<sz; i++){

                TreeNode n = q.poll();

                if(level %2 == 0)
                  
                   levellist.add(n.val);
                   
                   else

                     levellist.add(0, n.val);
                   
                

                if(n.left!=null ) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }

            ans.add(levellist);
            level++;
        }

        return ans;
    }
}