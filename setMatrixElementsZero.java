//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

public class setMatrixElementsZero{
	public static void main(String[] args){
		int[][] matrix=new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=8;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=0;
		matrix[2][1]=8;
		matrix[2][2]=9;
		setZero(matrix);	
	}

	static void setZero(int[][] m){
		boolean[] row = new boolean[m.length];
		boolean[] col = new boolean[m[0].length];
		for(int i=0; i<row.length;i++){
			for(int j=0; j<col.length; j++){
				if(m[i][j]==0){
					row[i]=true;
					col[j]=true;
				}
			}
		}
		for(int i=0; i<row.length;i++){
			for(int j=0; j<col.length; j++){
				if(row[i]==true||col[j]==true){
					m[i][j]=0;
				}
			}
		}

		for(int i=0; i<row.length;i++){
			for(int j=0; j<col.length; j++){
				System.out.println(m[i][j]);
			}
			System.out.println("-------");
		}
	}
}
