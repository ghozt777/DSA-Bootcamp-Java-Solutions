//leetcode Link: https://leetcode.com/problems/intersection-of-two-arrays/submissions/
import java.util.ArrayList;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}; // change according to test case
        int[] nums2 = {2,2};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans)); // expected 2
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        // sorting using insertion sort only one array cuz we will be testing its elements against the other one
        for(int i=0;i<nums1.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums1[j]>nums1[j-1]) break;
                else {
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                }
            }
        }
        // adding common elements in an arrayList
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    // if the list is empty then add the common element
                    if(ans.size()==0) ans.add(nums1[i]);
                    // if it is not empty then check if its the last element that was added in the List 
                    // and since the first array was sorted there is no chance that same element will appear after once it occured
                    // so if it is not equal to the last added element it is an unique common element add to the List
                    else if(ans.get(ans.size()-1)!=nums1[i]) ans.add(nums1[i]);
                }
            }
        }
        // converting list to array cuz the ans wants array
        int[] ansArr = new int[ans.size()];
        for(int i=0;i<ans.size();i++) ansArr[i] = ans.get(i);
        return ansArr;
    }
}