class Solution {
    public int beautySum(String s) {
       // HashMap<Character,Integer> map= new HashMap<>();
        int n = s.length();
        int ans=0; 
        for(int i=0;i<n;i++){
           
           HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                //int p = s.substring(i,j);
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                int maxFre = 0;
                int minFre = Integer.MAX_VALUE;
                for (int freq : map.values()) {
                    maxFre = Math.max(maxFre, freq);
                    minFre = Math.min(minFre, freq);
                }
                ans = ans+maxFre-minFre;
            }
            
        }
        return ans;
        
        
    }
}