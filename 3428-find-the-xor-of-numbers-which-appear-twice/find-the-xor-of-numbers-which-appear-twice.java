
import java.util.ArrayList;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 2 && !arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
        }

        int ans[] = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        int xor = 0;

        for (int i = 0; i < ans.length; i++) {
            xor = xor ^ ans[i];
        }

        return xor;
    }
}
