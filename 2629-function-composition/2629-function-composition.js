var compose = function(functions) {
return function(x) {
let funcLen=functions.length;
        for(let i=funcLen-1;i>=0;i--){
            x=functions[i](x);
        }
return x;
        
    }
};