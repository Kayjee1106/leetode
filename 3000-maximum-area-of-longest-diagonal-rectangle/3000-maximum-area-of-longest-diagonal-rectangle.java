class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
                int a=dimensions[i][0];
                int b=dimensions[i][1];
                double h=Math.sqrt((a*a)+(b*b));
                 if (h > max || (h == max && a*b > area)) {
                max = h;
                area = a*b;
            }
        }
        return area;
    }                              
}