class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character,Integer> hm = new HashMap<>();

        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();


        for(int i = 0; i<charArr1.length; i++){
             hm.put(charArr1[i], hm.getOrDefault(charArr1[i], 0) + 1);
        }
        for(int i = 0; i<charArr2.length; i++){
             hm.put(charArr2[i], hm.getOrDefault(charArr2[i], 0) - 1);
        }

        for(int value: hm.values()){
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}