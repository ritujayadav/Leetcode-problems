var map = function(arr, fn) {
var g=[];
for(i=0;i<arr.length;i++)
    {
g[i]=fn(arr[i],i);
    }
    return g;
};