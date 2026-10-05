class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Creating the hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int Complement = target - nums[i];
            // Check if this iteration of the hashmap key has the Complement saved for this index
            if (map.containsKey(Complement)) {
                return new int[] {map.get(Complement), i};
            }
            // if this iteration did NOT have that complement then add this index to the hashmap key then
            // keep moving
            else {
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No match");

    }
}
