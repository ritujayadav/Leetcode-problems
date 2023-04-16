
class Solution {
public String replaceWords(List<String> dictionary, String sentence) {

    String[] starr = sentence.split(" ");
    for(int i=0;i<starr.length;i++){
        for(int j=0;j<dictionary.size();j++)
            if(starr[i].startsWith(dictionary.get(j)))
                starr[i]=dictionary.get(j);
    }
    String ans="";
    for(String s:starr)
        ans+=s+" ";
    return ans.trim();
}
}


