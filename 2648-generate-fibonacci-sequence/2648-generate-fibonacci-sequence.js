
var fibGenerator = function*() {
    for (let a = 0, b = 1; true; b += a, a = b - a) 
    yield a;    
};

