class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            if(map.containsKey(sort(strs[i]))){
                map.get(sort(strs[i])).add(strs[i]);

            }
            else{
                map.put(sort(strs[i]),new ArrayList<String>());
                map.get(sort(strs[i])).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());


        
    }
    public String sort(String  word){
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String sortedWord = new String(arr);
        return sortedWord;

    }
}