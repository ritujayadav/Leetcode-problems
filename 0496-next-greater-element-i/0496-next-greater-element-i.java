import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> x=new Stack<>();
        Map<Integer,Integer> y=new HashMap<>();
        
        for(int i:nums2){
        while(!x.isEmpty() && i>x.peek()){
            y.put(x.pop(),i);
            
            
        }
        x.push(i);    
        }
while(!x.isEmpty()){
    y.put(x.pop(),-1);
}
        int q[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            q[i]=y.get(nums1[i]);
            
        }
return q;
    }
}