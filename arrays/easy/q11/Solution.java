import java.util.*;
class Solution{
    public static void main(String[] args) {
        // Driver Code
        String[][] items = {
            {"phone","blue","pixel"},
            {"computer","silver","phone"},
            {"phone","gold","iphone"}
        };
        String ruleKey = "color" , ruleValue = "silver";
        int ans = countMatches(items,ruleKey,ruleValue); 
        System.out.print(ans);
    }
    static int countMatches(String[][] items,String ruleKey,String ruleValue){
        int count = 0;
        for(String[] item : items){
            switch(ruleKey){
                case "type" : 
                    if(item[0] == ruleValue){
                        count++;
                        break;
                    }
                case "color":
                if(item[1] == ruleValue){
                    count++;
                    break;
                }
                case "name":
                if(item[2] == ruleValue){
                    count++;
                    break;
                }
                default:
                break;
            }
        }
        return count;
    }
}