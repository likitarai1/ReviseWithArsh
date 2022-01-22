class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        int ji=r-1;
          for(int i=0;i<r;i++){
              if(i<ji){
                for(int k=0;k<r;k++){
                    int temp = matrix[i][k];
                    matrix[i][k] = matrix[ji][k];
                    matrix[ji][k] = temp;

                }
                  ji--;
            }
            else{
                  break;
            }
            
        }
        
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                      
                System.out.print(matrix[i][j]+" ");
            }
            
            System.out.println("");
        }
        
        return matrix;
    }
}