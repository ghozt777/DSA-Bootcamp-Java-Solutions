package sorting.easy.q3;
class Main {
    public boolean containsDuplicate(int[] arr) {
        // using insertion sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]) break;
                else{
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) return true;
        }
        return false;
    }
}