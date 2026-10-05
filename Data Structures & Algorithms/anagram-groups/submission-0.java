class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap that we will compare from
        Map<String, List<String>> map = new HashMap<>();

        // iterate through the given str
        for (String word: strs) {
            // Sort the word by the letters
            String sort = sortStr(word);

            // if this current sorted word is not in the existing hashmap we add it
            map.putIfAbsent(sort, new ArrayList<>());
            
            // once it has been added to the hashmap then we add the current word
            map.get(sort).add(word);
        }

        return convertToList(map);
    }

    // create a new list to hold all groupings of the anagrams
    private List<List<String>> convertToList(Map<String, List<String>> map) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> anagrams: map.values()) {
            result.add(anagrams);
        } 
        return result;
    }
 
    // Method to sort the str that were currently on
    private String sortStr(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
