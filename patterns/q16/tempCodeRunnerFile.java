    for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    pascal.get(i).set(j,1);
                }
                else{
                    pascal.get(i).set(j,pascal.get(i-1).get(j)+pascal.get(i-1).get(j-1));
                }
            }
        }