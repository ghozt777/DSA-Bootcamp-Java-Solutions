class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int maxCandyWithAKid = 0;
        for(int candy : candies) maxCandyWithAKid = Math.max(maxCandyWithAKid,candy);
        for(int candy:candies) ans.add((candy+extraCandies) >= maxCandyWithAKid);
        return ans;
    }
}