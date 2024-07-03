class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(solve(red,blue),solve(blue,red));
    }
    public int solve(int red, int blue){
        int height = 0;
        boolean useRed=true;
        while (true) {
            int ballsNeeded = height + 1;

            if (useRed) {
                if (red >= ballsNeeded) {
                    red -= ballsNeeded;
                } else {
                    break;
                }
            } else {
                if (blue >= ballsNeeded) {
                    blue -= ballsNeeded;
                } else {
                    break;
                }
            }
            height++;
            useRed = !useRed;
        }
        return height;
    }
}