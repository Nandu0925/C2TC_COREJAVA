package day1;

public class Practice {

		public static void main(String[] args) {
			        int n = 6; 
			        int[][] matrix = new int[n][n];
			        for (int i = 0; i < n; i++) {
			        	if(i%2!=0)
			            matrix[i][i] =  i+1;
			        }
			        for (int i = 0; i < n; i++) {
			            for (int j = 0; j < n; j++) {
			                System.out.print(matrix[i][j] + " ");
			            }
			            System.out.println();
			        }
		}


}
