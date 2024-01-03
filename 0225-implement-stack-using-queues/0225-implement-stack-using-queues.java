class MyStack {
         
    
    Queue<Integer>q1;
    Queue<Integer>q2;

    public MyStack() {
   q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
        swap();
    }
    
    public int pop() {
       int  x=q1.peek();
q1.poll();
        return x;
        
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

private void swap() {
Queue<Integer> tem=q1;
    q1=q2;
    q2=tem;
    

}
}





