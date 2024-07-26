class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long x=maxDiff(horizontalCuts,h);
        long y=maxDiff(verticalCuts,w);
        return (int)((x*y)%1000000007);
    }
    private int maxDiff(int arr[],int length){
        Arrays.sort(arr);
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]-arr[i-1]);
        }
        max=Math.max(max,length-arr[arr.length-1]);
        return max;
    }
}