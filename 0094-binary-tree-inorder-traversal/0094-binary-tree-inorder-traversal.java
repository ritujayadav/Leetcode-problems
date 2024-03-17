
class Solution {
List<Integer> x=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return x;
        }
        inorderTraversal(root.left);
        x.add(root.val);
        inorderTraversal(root.right);
    
    return x;}
}