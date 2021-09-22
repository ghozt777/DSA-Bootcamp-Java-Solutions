class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(ans.size()==0) ans.add(nums1[i]);
                    else if(ans.get(ans.size()-1)!=nums1[i]) ans.add(nums1[i]);
                }
            }
        }
        int[] ansArr = new int[ans.size()];
        for(int i=0;i<ans.size();i++) ansArr[i] = ans.get(i);
        return ansArr;
    }
}