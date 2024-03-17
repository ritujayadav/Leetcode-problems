class Solution {
   List<Integer> c=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
     
        if(root==null){
            return c;
    }
      
        c.add(root.val);
       preorderTraversal(root.left);
       preorderTraversal(root.right);
    return c;
}
}