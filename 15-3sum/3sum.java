class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> st = new HashSet<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            Set<Integer> temp = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int t = -(nums[i] + nums[j]);

                if (temp.contains(t)) {
                    st.add(Arrays.asList(nums[i], nums[j], t));
                }

                temp.add(nums[j]);
            }
        }

        return new ArrayList<>(st);
    }
}
