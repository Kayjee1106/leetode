// class Solution {
//     int dp[][];
//     private boolean solve(String s, int i,int j){
//         if(i>=j){
//             return true;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j]==1;
//         }
//         if(s.charAt(i)==s.charAt(j)){
//             dp[i][j]= solve(s,i+1,j-1)? 1:0;
//         }
//         else{
//           dp[i][j]=0;  
//         }
//         return dp[i][j]==1;
//     }
//     public String longestPalindrome(String s) {
//         int n=s.length();
//         int max=0;
//         int sp=0;
//         dp=new int[n][n];
//         for(int i=0;i<n;i++){
//             Arrays.fill(dp[i],-1);
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 if(solve(s,i,j)){
//                     if(j-i+1>max){
//                         max=j-i+1;
//                         sp=i;
//                     }
//                 }
//             }
//         }
//         return s.substring(sp,sp+max);
//     }
// }
class Solution {
    public String longestPalindrome(String s) {
        StringBuilder t = new StringBuilder("$#");
        for(char ch : s.toCharArray()) {
            t.append(ch).append('#');
        }
        t.append('@');

        int n = t.length();
        int[] radii = new int[n];
        int center = 0, radius = 0;
        for(int i = 0; i < n; i++) {
            int mirror = 2 * center - i;
            if(i < radius) {
                radii[i] = Math.min(radius - i, radii[mirror]);
            }
            while(i + 1 + radii[i] < n && 
                  i - 1 - radii[i] >= 0 &&
                  t.charAt(i + (1 + radii[i])) == t.charAt(i - (1 + radii[i]))) {
                radii[i]++;
            }
            if(i + radii[i] > radius) {
                center = i;
                radius = i + radii[i];
            }
        }
        int maxl = 0;
        int centeri = 0;
        for(int i = 0; i < n; i++) {
            if(radii[i] > maxl) {
                maxl = radii[i];
                centeri = i;
            }
        }
        int start = (centeri - maxl) / 2;
        return s.substring(start, start + maxl);
    }
}