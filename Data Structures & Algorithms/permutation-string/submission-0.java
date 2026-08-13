class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int s1Count[]= new int[26];
        int windCount[]= new int[26];

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        for(int right = 0;right < s2.length();right++){
             windCount[s2.charAt(right)-'a']++;

             if((right - left + 1) > s1.length()){
                windCount[s2.charAt(left)-'a']--;
                left++;
             }

             if((right - left + 1) == s1.length()){
                if(Arrays.equals(s1Count,windCount)){
                    return true;
                }
             }
        }
        return false;
    }
}
