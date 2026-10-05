class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Creating a hashmap to determine if its been seen before
        Map<Integer, Integer> count = new HashMap<>();

        // first lets iterate through this array
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Using the bucket sort method we organize
        List<Integer>[] buckets = new List[nums.length + 1];
        count.forEach((num, freq) -> {
            if (buckets[freq] == null)
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });
        List<Integer> result = new ArrayList<>();

        for (int i = buckets.length - 1; i > 0 && result.size() < k; i--) {
            if (buckets[i] != null)
                result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
