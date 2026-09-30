class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> res=new HashMap<>();
       for(String s: strs)
       {
        char[] charArray= s.toCharArray();
        Arrays.sort(charArray);
        String s1=new String(charArray);
        res.putIfAbsent(s1, new ArrayList<>());
        res.get(s1).add(s);

       }
       return new ArrayList<>(res.values()); 
    }
}
