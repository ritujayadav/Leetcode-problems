class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> c=new ArrayList<>();
        if(root==null){
            return c;
    }
      
        c.add(root.val);
        c.addAll(preorderTraversal(root.left));
          c.addAll( preorderTraversal(root.right));
    return c;
}
}