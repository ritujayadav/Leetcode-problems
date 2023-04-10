var findDuplicate = function(nums) {
    //just practising in javascript(violating the condition by sorting)
nums.sort();

for (let i = 0; i < nums.length; i+=2) {
    if (nums[i] === nums[i+1] || nums[i] === nums[i-1]) 
        return nums[i];
}
};