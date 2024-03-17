
class Solution {
List<Integer> x=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return x;
        }
        postorderTraversal(root.left);
    
        postorderTraversal(root.right);
            x.add(root.val);
    
    return x;
    }
}