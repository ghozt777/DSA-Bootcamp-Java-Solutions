class Main{
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] {10,9,8,7}, new int[] {5,6,7,8}));
    }
    static int findContentChildren(int[] g, int[] s){
        insertionSort(g);
        insertionSort(s);
        int gI = g.length-1;
        int sI = s.length-1;
        int content = 0;
        while(gI>=0&&sI>=0){
            if(g[gI]<=s[sI]){
                ++content;
                gI--;
                sI--;
            }else{
                gI--;
            }
        }
        return content;
    }
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]) break;
                else {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}