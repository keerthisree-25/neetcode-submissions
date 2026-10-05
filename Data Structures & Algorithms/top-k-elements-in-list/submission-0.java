class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] cnt=new int[2001];
        for(int i:nums){
            cnt[i+1000]++;
        }
        ArrayList<Integer>[] buckets=new ArrayList[nums.length+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]>0){
                buckets[cnt[i]].add(i-1000);
            }
        }
        int[] ans=new int[k];
        int idx=0;
        for(int i=buckets.length-1;i>=0;i--){
            for(int num:buckets[i]){
                ans[idx++]=num;
                if(idx==k)
                return ans;
            }
        }
        return ans;
    }
}
