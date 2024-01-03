class MyStack {
         
  //queue : use peek for top ...add for push.. poll for pop  
    Queue<Integer>q1;


    public MyStack() {
   q1=new LinkedList<>();
        
    }
    
    public void push(int x) {
       q1.add(x);
int s=q1.size();
        for(int i=0;i<s-1;i++){
            q1.add(q1.peek());
           q1.poll();
        }
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

}





