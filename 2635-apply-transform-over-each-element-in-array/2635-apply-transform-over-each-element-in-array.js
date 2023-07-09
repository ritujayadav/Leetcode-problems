var map = function(arr,n) {
var g=[];
for(i=0;i<arr.length;i++)
    {
g[i]=n(arr[i],i);
    }
    return g;
};