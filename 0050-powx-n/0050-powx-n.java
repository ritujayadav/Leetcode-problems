class Solution {
    public double myPow(double x, int n) {
        //main function
          if(n>=0)
          {
                return power(x,n);
          } 
          else
              n=n*-1;
           return (1/power(x,n));
          
    }
    
    //recursiove function
    public double power(double x,int n)
    {
         if(n==0)
         { return 1;}
         if(n==1) 
         {return x;}

         if(n%2==0)
         {
               double ans =power(x,n/2);
               return ans*ans;
         }
         else{
              double ans =power(x,n/2);
              return ans*ans*x;
//when n is divided  by 2 --1 will be a remainder so we are multiplying the 1 as x
         }

    }
}