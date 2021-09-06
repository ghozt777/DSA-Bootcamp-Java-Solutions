// Leetcode Link: https://leetcode.com/problems/single-element-in-a-sorted-array/

class Main{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,8,8}; // modify this array accordingly
        int ans = singleNonDuplicate(arr);
        System.out.println(ans); // Expected ans : 3 
    }
    static int singleNonDuplicate(int[] arr){
        // corner cases
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];
        
        // actual logic using binary search
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]) return arr[mid];
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]) start = mid +1;
                else end = mid - 1;
            }
            if(mid%2!=0){
                if(arr[mid]!=arr[mid+1]) start = mid+1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}

/*
    Explaination: 

    As every number occurs in pairs except for one
    all the pairs that are there befor the single element the first number of that pair starts at an even index and ends at an odd index 
    Hence manipulate the start and end index such that the serach window narrows down the the correct size

    NOTE: No element occurs more than twice 
          and there is only one element that occurs once

   even starting index   odd starting index          
             👇          👇
    index:    0  1  2  3  4  5  6  7  8
    -------------------------------------------
    value:  { 1 ,1 ,2 ,2 ,3 ,4 ,4 ,5 ,5 }
                         ☝🏻 : TARGET  

    as seen from the table all the pairs before the target element start with a even index and ends with an odd index
    Eg: `1` occurs in a pair and starts at an even index (0) and ens at an odd index (1) hence the target element lies to its right 
    Pairs after the target element start with an odd index and end on an even index hence the target element lise to its left
    Eg `5` occurs after thet target and hence the pair starts on on odd index (7) and ends on en even index (8)
-------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
    CASE 1: TARGET FOUND
    <arr[mid] is the unique element> return mid
-------------------------------------------------------------------------------------
    CASE 2: `mid` IS AT AN EVEN INDEX like: 2,4,6.....
    
    as we know if a pair starts at an even index the single element lies to its right else it lies to its left
    Therefore: if(arr[mid]==arr[mid+1]) -> lies in right side -> start = mid + 1
               else -> lies in left side -> end = mid - 1
 ------------------------------------------------------------------------------------   
    CASE 3: `mid` IS AT AN ODD INDEX
        if the next element to a odd index is different than the current element then the target lies to its right else if element at the odd index is same as that of the next element then the target lies to its left
        Threrefore: if(arr[mid]!=arr[mid+1]) start = mid + 1
                    else end = mid - 1
------------------------------------------------------------------------------------   
------------------------------------------------------------------------------------   
*/
