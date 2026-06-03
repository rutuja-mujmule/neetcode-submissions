class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> r= new HashMap<>();
     for(String s:strs)
     {
        char[] charAr= s.toCharArray();
        Arrays.sort(charAr);
        String sortedstr = new String(charAr);
        r.putIfAbsent(sortedstr, new ArrayList<>());
        r.get(sortedstr).add(s);
     }

     return new ArrayList(r.values());
    }
}
