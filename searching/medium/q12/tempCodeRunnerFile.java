if(matrix.length==1){
            int start = 0;
            int end = matrix[0].length - 1;
            while(start<=end){
                int mid = start + (end-start) / 2;
                if(matrix[0][mid]==target) return true;
                if(matrix[0][mid]<target) start = mid+1;
                else end = mid -1; 
            }
            return false;
        }