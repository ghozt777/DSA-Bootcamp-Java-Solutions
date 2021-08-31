 List<Integer> ans = new ArrayList<Integer>();
        for(int i : num) ans.add(i);
        int[] add = new int[String.valueOf(k).length()];
        for(int i=0;i<add.length;i++){
            add[add.length-i-1] = k%10;
            k /= 10;
        }
        int ptr = ans.size()-1;
        for(int i=add.length-1;i>=0;i--){
            ans.set(ptr,ans.get(ptr)+add[i]);
            ptr--;
        }
        for(int i=ans.size()-1;i>=0;i--){
            if(ans.get(i)>9){
                ans.set(i-1,ans.get(i-1)+1);
                ans.set(i,10-(ans.get(i)));
            }
        }
        return ans;