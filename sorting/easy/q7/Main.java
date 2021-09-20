class Main{
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }
    static int thirdMax(int[] arr){
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for(Integer num : arr){
            if(num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) continue;
            if(max == null || num > max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }
            else if(secondMax == null || num > secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }
            else if(thirdMax == null || num > thirdMax){
                thirdMax = num;
            }
           
        }
        return thirdMax == null ? max : thirdMax;
    }
}