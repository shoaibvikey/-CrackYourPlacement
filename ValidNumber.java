/*class Solution {
    public boolean isNumber(String s) {
        int i=0;
        boolean ex=false,dig=false,dot=false;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(isDigit(ch)){
                dig=true;
            }else if(ch=='-' || ch=='+'){
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') return false;
            }
            else if(ch=='e' || ch=='E'){
                if(ex || !dig) return false;
                ex=true;
                dig=false;
            }else if(ch=='.'){
                if(dot || ex) return false;
                dot=true;
            }else return false;
            i++;
        }
        return dig;
    }
    public boolean isDigit(char ch){
        if(ch>='0' && ch<='9') return true;
        return false;
    }
} */