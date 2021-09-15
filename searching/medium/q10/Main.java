class Main{
    public static void main(String[] args) {
       int[] piles = {30,11,23,4,20};
       int h = 6;
       System.out.println(minEatingSpeed(piles, h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = Integer.MIN_VALUE;
        for(int bananas : piles) maxSpeed = Math.max(maxSpeed,bananas);
        while(minSpeed < maxSpeed){
            int speed = minSpeed + (maxSpeed-minSpeed) / 2;
            if(canEatInTime(piles,speed,h)) maxSpeed = speed;
            else minSpeed = speed + 1;
        }
        return minSpeed;
    }
    static boolean canEatInTime(int[] piles, int speed , int time){
        int currTime = 0;
        for(int bananas : piles){
            currTime += bananas / speed;
            if(bananas % speed !=0) currTime++;
        }
        return currTime<=time;
    }
}
