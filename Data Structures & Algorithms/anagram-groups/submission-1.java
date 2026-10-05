class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // first initialize the hashmap that will be used to compare the hashmap
        Map<String, List<String>> map = new HashMap<>();

        for (String word: strs) {
            // the approach I'm going to take is first sort the words in 
            // original list to then compare it to an exisitng hashmap

            // sort the word
            String sort = sortStr(word);

            // if this sort word is absent add it to the array list
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(word);
        }

        return convertToList(map);

    }

    private List<List<String>> convertToList(Map<String, List<String>>map) {
        List<List<String>> result = new ArrayList<>();
        
        for (List<String> anagrams: map.values()) {
            result.add(anagrams);
        }

        return result;
    }

    private String sortStr(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
