class Solution {
    public boolean isAnagram(String s, String t) {
        // first easy check to see if lengths are the same
        if (s.length() != t.length()) return false;

            // create an array to organize all numbers found
            // and create a count to see if the value stays
            int[] charCounts = new int[26];

            // iterate through both arrays 
            for (int i = 0; i < s.length(); i++) {
                charCounts[s.charAt(i)-'a']++;
                charCounts[t.charAt(i)-'a']--;
            }

            // give a check to see if the array is all value zero otherwise its NOT
            // an anagram
            for (int count : charCounts) {
                if (count!= 0) return false;
            }

            return true;
    }
}
