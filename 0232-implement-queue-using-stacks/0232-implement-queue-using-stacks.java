
class MyQueue {
        Stack<Integer> q1;
        Stack<Integer> q2;
    public MyQueue() {
        q1=new Stack<>();
        q2=new Stack<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.push(q1.pop());
        
        } 

q1.push(x);
        while (!q2.isEmpty()) {
            q1.push(q2.pop());
        }
    }
    
    public int pop() {
        int x=q1.peek();
        q1.pop();
        return x;
    }
    
    public int peek() {
        return q1.peek();
    }
    
    public boolean empty() {
        return(q1.isEmpty());
    }
}