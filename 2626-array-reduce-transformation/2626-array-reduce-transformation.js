var reduce = function(nums, fn, t) {
    if(nums.length == 0){
        return t
    }
    for(let i = 0; i < nums.length; i++){
       t = fn(t,nums[i])
    }
    
    return t
};

