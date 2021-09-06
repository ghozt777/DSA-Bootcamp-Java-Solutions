static int countNegatives(int[][] grid){
        int count = 0;
        for(int[] row : grid){
            count += countNegativesIn1D(row);
        }
        return count;
    }
    static int countNegativesIn1D(int[] arr){
        if(arr[arr.length-1]>=0) return 0;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start) / 2;
            if(arr[mid]>=0) start = mid + 1;
            else end = mid - 1;
        }
        return (arr.length-1-end);
    }