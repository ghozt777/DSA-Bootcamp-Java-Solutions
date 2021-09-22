import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int nums1Size=nums1.length;
        int nums2Size=nums2.length;
        int i;
        int[] nums=new int[nums1Size+nums2Size];
        for(i=0;i<nums.length;i++){
            if(i<nums1Size){
                nums[i]=nums1[i];
            }
            else{
                nums[i]=nums2[i-nums1Size];
            }
        }
        Arrays.sort(nums);
        int count=0;
        int j=0;
        int rec=0;
        Vector<Integer> temp=new Vector<Integer>();
        int same=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]&&rec==0){
                rec++;
                same=nums[i];
                count=findMinimumInstances(nums[i], nums1, nums2);
                for(j=0;j<count;j++){temp.add(nums[i]);}
            }
            else if(rec!=0&&nums[i]!=same&&nums[i]==nums[i-1]){
                same=nums[i];
                count=findMinimumInstances(nums[i], nums1, nums2);
                for(j=0;j<count;j++){temp.add(nums[i]);}
            }
        }
        int size=temp.size();
        int[] ans=new int[size];
        for(i=0;i<size;i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
    public static int findMinimumInstances(int a,int[] nums1,int[] nums2){
       int count1=0;
       int count2=0;
       int i;
       for(i=0;i<nums1.length;i++){
           if(nums1[i]==a){count1++;}
       }
       for(i=0;i<nums2.length;i++){
           if(nums2[i]==a){count2++;}
       }
       if(count1<=count2){return count1;}
       else{return count2;}
   }
}