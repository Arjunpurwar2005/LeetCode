class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] freqs=new int[26];
        int [] freqp=new int [26];
        ArrayList<Integer>arr=new ArrayList<>();
        if(p.length()>s.length()){
            return arr;
        }
        int low=0;
        int high=p.length()-1;
        for(int i=0;i<p.length();i++){
            freqp[p.charAt(i)-'a']++;
            freqs[s.charAt(i)-'a']++;
            

        }
        if(Arrays.equals(freqp,freqs)){

            arr.add(low);
        }
        while(high<s.length()-1){
            low++;
            high++;
            freqs[s.charAt(low-1)-'a']--;
            freqs[s.charAt(high)-'a']++;
            if(Arrays.equals(freqs,freqp)){
                arr.add(low);
                
            }




        }
        return arr;
        
    }
}