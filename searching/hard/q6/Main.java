/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int start = 0;
        int end = arr.length()-1;
        int mid = 0;
        while(start < end){
            mid = start + (end-start)/2;
            if(arr.get(mid)<arr.get(mid+1)) start = mid + 1;
            else end = mid;
        }
        int newStart = 0;
        int newEnd = start;

        while(newStart<=newEnd){
            mid = newStart + (newEnd - newStart)/2;
            if(arr.get(mid)<target) newStart = mid + 1;
            else if(arr.get(mid)>target) newEnd = mid - 1;
            else return mid;
        }

        newStart = start;
        newEnd = arr.length()-1;
        while(newStart<=newEnd){
            mid = newStart + (newEnd - newStart)/2;
            if(arr.get(mid)<target) newEnd = mid - 1;
            else if(arr.get(mid)>target) newStart = mid + 1;
            else return mid;
        }

        return -1;
    }
}