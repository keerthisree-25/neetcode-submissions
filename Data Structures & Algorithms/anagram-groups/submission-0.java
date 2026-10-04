class Solution {
    public static boolean isAnagram(String strs,String s){
            if(s.length()!=strs.length())
            return false;
            int[] cnt=new int[26];
            for(int k=0;k<s.length();k++){
                cnt[s.charAt(k)-'a']++;
                cnt[strs.charAt(k)-'a']--;
            }
            for(int k:cnt){
                if(k!=0)
                return false;
            }
            return true;
    
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        boolean[] vis=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(vis[i])
            continue;
            ArrayList<String> ls=new ArrayList<>();
            ls.add(strs[i]);
            vis[i]=true;
            for(int j=i+1;j<strs.length;j++) {
                if(!vis[j] && isAnagram(strs[i], strs[j])) {
                    ls.add(strs[j]);
                    vis[j] = true; 
                }
            }
            ans.add(ls);
        }
        return ans;
    }
}
