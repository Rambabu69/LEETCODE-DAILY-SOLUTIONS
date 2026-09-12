class Solution {
    public int maxDepth(String s) {
        int max=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                max++;
            }
            if(ch==')'){
                max--;
            }
            len=Math.max(len,max);
        }
        return len;
    }
}