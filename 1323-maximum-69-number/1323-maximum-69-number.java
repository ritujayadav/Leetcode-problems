class Solution {
    public int maximum69Number (int num) {
        StringBuilder b=new StringBuilder();
        b.append(num);
        for (int i=0;i<b.length();i++){
            if(b.charAt(i)=='6'){
                b.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(b.toString());
    }
}

