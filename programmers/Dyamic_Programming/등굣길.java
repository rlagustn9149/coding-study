package programmers.Dyamic_Programming;

public class 등굣길 {
    class Solution {
        int mod = 1000000007;        
        public int solution(int m, int n, int[][] puddles) {
    
            int[][] board= new int[m+1][n+1];
            
            board[1][1]=1;
            
            for(int i=0; i<puddles.length; i++){
                board[puddles[i][0]][puddles[i][1]]=-1;
            }
            
            for(int i=1; i<=m; i++){
                for(int j=1; j<=n; j++){
                    if(board[i][j]==-1) continue;
                    if(i==1 && j==1) continue;
                    
                    if(board[i][j-1]==-1){
                        board[i][j]=board[i-1][j];
                    }else if(board[i-1][j]==-1){
                        board[i][j]=board[i][j-1];
                    }else{
                        board[i][j]=(board[i-1][j]+board[i][j-1])%mod;
                    }
                }
            }
                
            return board[m][n];
        }
    }
}
