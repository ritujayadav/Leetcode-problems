
var myAtoi = function(s) {
      const i = Number.parseInt(s)
    if(i){
        
        if (i <= -2147483648 ) 
            return -2147483648 ;
      
        else if (i >= 2147483647) 
            return 2147483647;
        else
            return i;
    }
    else 

        return 0;
};