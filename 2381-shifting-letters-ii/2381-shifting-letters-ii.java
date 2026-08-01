class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int ans[]=new int[n];

        StringBuilder sb=new StringBuilder();

        for(int arr[]: shifts){
            int l=arr[0];
            int u=arr[1];
            int x=arr[2];

            if(x==0){
                ans[l]-=1;
            }else{
                ans[l]+=1;
            }

            if(u+1 < n){
                if(x==0)
                ans[u+1]+=1;
                else
                ans[u+1]-=1;
            }
        }
        for(int i=0; i<n; i++){
            if(i==0){
                ans[i]=ans[i]%26;
                if(ans[i]<0)
                ans[i]+=26;
            }
            else{
                ans[i]+=ans[i-1];
                ans[i]=ans[i]%26;
                if(ans[i]<0)
                ans[i]+=26;
            }
        }
        for(int i=0; i<n; i++){
            char ch = (char)(((s.charAt(i) - 'a' + ans[i]) % 26) + 'a');
            sb.append(ch);
        }
        return sb.toString();
    }
}