import java.util.Scanner;

public class NQueensProblem {
	static boolean is_Attacked(int x, int y,long board[][],long N) {
		//Check a given row can be attacked 
		for(int i=0;i<y;i++) {
			if(board[x][i]==1) return true;
		}
		
		//Check a given column can be attacked 
		for(int i=0;i<x;i++) {
			if(board[i][y]==1) return true;
		}		
		
		//Check a diagonal cab be attacked
		for(int i=x,j=y;i<N && j<N;i++,j++) {
			if(board[i][j]==1)return true;
		}
		
		for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1)return true;
		}
		
		return false;
	}
	
	static boolean  NQueens(long board[][],long N){
		if(N==0) return true;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!is_Attacked(i, j, board, N)){
					board[i][j]=1;
					if(NQueens(board,N-1)) return true;
					board[i][j]=0;	
					
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     long no = s.nextLong();
	     
	     long[][] board= new long[4][4];
	     if(NQueens(board,no)) {
	    	 System.out.println("TRUE");
	    	 for(int i=0;i<no;i++) {
	 			for(int j=0;j<no;j++) {
	 				System.out.print(board[i][j]);
	 			}
	 			System.out.println();
	 			
	    	 }	
	     }
	     
	     else System.out.println("FALSE");
	    	 
	}
	
}
