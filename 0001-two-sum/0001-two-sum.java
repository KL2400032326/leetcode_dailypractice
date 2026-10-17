class Solution {
    public int[] twoSum(int[] nums, int target) {

        int l = 0, r = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < r; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < r; i++) {
            int need = target - nums[i];

            if (map.containsKey(need) && map.get(need) != i) {
                return new int[]{i, map.get(need)};
            }
        }

        return new int[]{-1, -1};
    }
}