
class Solution {
    public boolean isBalanced(TreeNode root) {
        return (heightcheck(root))!=-1;
    }
    public int heightcheck(TreeNode root){
        if (root==null){
return 0;
        }
        int l=heightcheck(root.left);
        if(l==-1){
            return -1;
        }
        int r=heightcheck(root.right);
       if(r==-1){
           return -1;
       }
        if(Math.abs(l-r)>1){
            return -1;
        }
        int height=Math.max(l,r)+1;    
        return height;
    }
}