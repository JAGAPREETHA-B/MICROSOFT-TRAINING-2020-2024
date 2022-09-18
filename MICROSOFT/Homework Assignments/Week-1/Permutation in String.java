class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] sm1 = new int[26];
        for (int i = 0; i < s1.length(); i++)
            sm1[s1.charAt(i) - 'a']++;
            int len=s2.length()-s1.length();
        for (int i = 0; i <=len;i++) {
            int[] sm2= new int[26];
            for (int j = 0; j < s1.length(); j++) {
                sm2[s2.charAt(i + j) - 'a']++;
            }
            if (matches(sm1, sm2))
                return true;
        }
        return false;
    }
    
    public boolean matches(int[] sm1, int[] sm2) {
        for (int i = 0; i < 26; i++) {
            if (sm1[i] != sm2[i])
                return false;
        }
        return true;
    }
}
