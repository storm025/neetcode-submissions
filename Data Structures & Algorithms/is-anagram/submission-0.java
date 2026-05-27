class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        HashMap<Character,Integer> mp1 = new HashMap<>();

        for(int i=0;i<n;i++){
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1); 
        }


        int m = t.length();
        HashMap<Character,Integer> mp2 = new HashMap<>();

        for(int i=0;i<m;i++){
            mp2.put(t.charAt(i),mp2.getOrDefault(t.charAt(i),0)+1); 
        }

        if(n!=m) return false;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!mp1.get(ch).equals(mp2.get(ch))){
                return false;
            }
        }

        return true;
        
    }
}

/*
Len of both strings must be ==
HashMap --> every char should be found in the other map with same count.

*/
