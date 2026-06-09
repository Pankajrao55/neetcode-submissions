
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

    List<List<Integer>> ans = new ArrayList<>();

    while(!q.isEmpty()){
        int sz = q.size();
        List<Integer> level = new ArrayList<>();
  
      for(int i=0; i<sz; i++){

        TreeNode n = q.poll();


        level.add(n.val);

        if(n.left!=null)  q.add(n.left);
        if(n.right!=null) q.add(n.right);


    }
        ans.add(level);
    }

    return ans;
        
    }
}
