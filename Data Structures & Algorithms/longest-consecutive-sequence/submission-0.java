class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans=0;
        for(int i:hs){
            if(!hs.contains(i-1)){
                int curr=1;
                int num=i;
                while(hs.contains(num+1)){
                    curr++;
                    num++;
                }
            ans=Math.max(ans,curr);
            }
        }
        return ans;
    }
}
