
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] countp = new int[26];
        int[] counts = new int[26];
        List<Integer> result = new ArrayList<>();
        for(char c : p.toCharArray()){
            countp[c - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i) - 'a']++;
            if(i>=p.length()){
                counts[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(counts,countp)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}