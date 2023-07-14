var reduce = function(s, fn, t) {
    if(s.length == 0){
        return t
    }
    for(let i = 0; i < s.length; i++){
       t = fn(t,s[i])
    }
    
    return t
};

