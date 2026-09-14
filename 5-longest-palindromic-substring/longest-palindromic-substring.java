class Solution {
    public String longestPalindrome(String s) {

        String longest = "";

        
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                
                int low = 0;
                int high = sub.length() - 1;

                boolean palindrome = true;

                
                while (low < high) {

                    if (sub.charAt(low) != sub.charAt(high)) {
                        palindrome = false;
                        break;
                    }

                    low++;
                    high--;
                }

                if (palindrome && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }
}