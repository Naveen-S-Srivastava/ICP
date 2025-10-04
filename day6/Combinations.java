
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
    public void fun(List<List<Integer>> ans, List<Integer> lis, int n,int k,int idx){
        if(lis.size()==k){
            ans.add(new ArrayList<>(lis));
            return;
        }
        if(lis.size()>k) return;

        for(int i=idx ; i<=n ; i++){
            lis.add(i);
            fun(ans,lis,n,k,i+1);
            lis.remove(lis.size()-1);
        }
    }
} {
    
}
