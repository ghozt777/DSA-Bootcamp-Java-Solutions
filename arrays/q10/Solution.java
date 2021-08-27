import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.next();
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence){
        ArrayList<Boolean> checkList = new ArrayList<>(26);
        for(int i=0;i<26;i++) checkList.add(false);
        int key;
        for(char ch : sentence.toLowerCase().toCharArray()){
            key = (int)ch - 97;
            checkList.set(key,true);
        }
        for(boolean check : checkList) if(!check) return false;
        return true;
    }
}