class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] temp = new int[A.length];
        int count = 0;
        for(int i=0;i<A.length;i++)
            if(A[i]%2==0){temp[count++]=A[i];}
        for(int i=0;i<A.length;i++)
            if(A[i]%2==1){temp[count++]=A[i];}
        return temp;
        
    }
}