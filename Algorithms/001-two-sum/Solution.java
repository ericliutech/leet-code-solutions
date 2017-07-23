public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (map.containsKey(Integer.valueOf(diff))) {
                return new int[]{map.get(Integer.valueOf(diff)), Integer.valueOf(i)};
            }
            map.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }
        
        throw new IllegalArgumentException("No solution");
    }
}
