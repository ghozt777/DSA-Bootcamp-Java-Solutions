class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int zeroCount=0;
        for(int val : arr){
            if(val==0) ++zeroCount;
            map.put(val,true);
        }
        if(zeroCount>1) return true;
        for(int val : arr) if(val!=0&&map.containsKey(2*val)) return true;
        return false;
    }
}