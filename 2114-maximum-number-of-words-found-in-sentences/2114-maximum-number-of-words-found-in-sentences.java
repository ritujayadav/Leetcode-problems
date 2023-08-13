class Solution {
public int mostWordsFound(String[] sentences) {
int m= 0;
for(String i: sentences)
{
        String[] x = i.split(" ");
        int l= x.length;        
        if(l> m){
            m = l;
        }
    }return m;
}
}