class Solution {
    public int solve(List<Integer> arr,int k){
        int index = 0; 
        while (arr.size() > 1) {
            index = (index + k - 1) % arr.size();
            arr.remove(index);
        }
        return arr.get(0);
    }
    public int findTheWinner(int n, int k) {
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        return solve(arr,k);
    }
}