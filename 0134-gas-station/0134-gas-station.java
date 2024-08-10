class Solution {
    private int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int x=sum(gas);
        int y=sum(cost);
        if(y>x){
            return -1;
        }
        int total =0;
        int result=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                result=i+1;
            }
        }
        return result;
    }
}