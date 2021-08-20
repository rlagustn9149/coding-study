package programmers.Dyamic_Programming;

public class 정수삼각형 {
    class Solution {
        public int solution(int[][] triangle) {
            int height = triangle.length;
            
            for(int i=1; i< triangle.length; i++){
                for(int j=0; j<triangle[i].length; j++){
                    if(j==triangle[i].length-1) triangle[i][j] += triangle[i-1][j-1];
                    else if(j==0){
                        triangle[i][j]+=triangle[i-1][j];                
                    }else{
                        int left=triangle[i][j] +triangle[i-1][j-1];
                        int right=triangle[i][j]+triangle[i-1][j];
                        triangle[i][j]=Math.max(left,right);
                    }
                }
            }   
            int answer=0;
            for(int i=0; i<triangle[height-1].length; i++){
                answer = Math.max(answer,triangle[height-1][i]);
            }
            
    
            
            return answer;
        }
    }
}
