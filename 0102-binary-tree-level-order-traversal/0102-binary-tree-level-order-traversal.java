class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> fin=new LinkedList<List<Integer>>();
        
    if(root ==null){
return fin;
    }   
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> sub=new LinkedList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                queue.add(queue.peek().right);
                }
                sub.add(queue.poll().val);
            }
            fin.add(sub);
        }
        return fin;
    }
}