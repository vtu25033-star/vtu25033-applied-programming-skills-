class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsets(new ArrayList<>(),nums,0,list);
        return list;
    }
    public void subsets(ArrayList<Integer> ans,int[] nums,int idx,List<List<Integer>> list){
        if(idx==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        // SKIP
        subsets(ans,nums,idx+1,list);
        // PICK 
        ans.add(nums[idx]);
        subsets(ans,nums,idx+1,list);
        // BACK TRACK
        ans.remove(ans.size() - 1);
    }
}