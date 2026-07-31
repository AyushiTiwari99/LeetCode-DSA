class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int freq[]=new int[26];
        for(int i=0; i<n; i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        
        int i=25;
        int ans=0;

        while(i>=0){
            if(i>=18){
                ans+=1*freq[i];
            }else if(i>=10){
                ans+=2*freq[i];
            }else if(i>=2){
                ans+=3*freq[i];
            }else{
                ans+=4*freq[i];
            }
            i--;
        }
        return ans;
    }
}