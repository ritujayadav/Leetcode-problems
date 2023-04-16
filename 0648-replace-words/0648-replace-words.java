
class Solution {
public String replaceWords(List<String> dictionary, String sentence) {

    String[] s = sentence.split(" ");
    for(int i=0;i<s.length;i++){
        for(int j=0;j<dictionary.size();j++)
            if(s[i].startsWith(dictionary.get(j)))
                s[i]=dictionary.get(j);
    }
    String a="";
    for(String x:s)
        a+=x+" ";
    return a.trim();
}
}


