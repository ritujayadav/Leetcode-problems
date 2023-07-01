var once = function(fn) {
    let c = 0;
    return function(...args){
        c++;
if(c == 1)        {
  return fn(...args);        }
        return undefined;
    }
}