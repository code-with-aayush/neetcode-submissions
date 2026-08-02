class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map_s = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            if(map_s.containsKey(s.charAt(i))){
                map_s.put(s.charAt(i),map_s.getOrDefault(s.charAt(i), 0) + 1);
            }
            else{
                map_s.put(s.charAt(i),1);
            }
        }

        for(int i = 0; i< t.length(); i++){
            if(map_s.containsKey(t.charAt(i))){
                map_s.put(t.charAt(i),map_s.get(t.charAt(i)) - 1);
            }
            else{
                return false;
            }
        }

        for(int val : map_s.values()){
            if(val != 0){
                return false;
            }
        }
        return true;

    }
}
