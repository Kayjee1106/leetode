class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr=new int[2];
        for(int x:students){
            arr[x]++;
        }
        for(int i=0;i<students.length;i++){
            if(arr[sandwiches[i]]==0)return students.length-i;
            arr[sandwiches[i]]--;
        }
        return 0;
    }
}