package CollectionSort;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class NQueens {
	

	public static void main(String args[]) throws Exception {

		
		FastReader scan = new FastReader();

		BufferedOutputStream out = new BufferedOutputStream(System.out);

		StringBuilder output = new StringBuilder();
		int N= scan.nextInt();
		int[][] chessBoard= new int[N][N];
		if(nQueensBoard(chessBoard,N)) {
			System.out.println("YES");
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(chessBoard[i][j]+" ");
					
				}
				System.out.println();
			}
		}
		else {
			System.out.println("NO");
		}
	
		
		out.write(output.toString().getBytes());

		out.flush();
	

	}

	static long numBits(long num) {
		long count = 0;
		while ((num & num - 1) > 0) {
			++count;
			num = num & num - 1;
		}
		return count;
	}
	//method to find a given cell is attacked or not
	static boolean isAttacked(int[][] board,int row,int col,int boardLength) {
		//check  row
		for(int j=0;j<boardLength;j++) {
			if(board[row][j]==1) {
				return true;
			}
		}
		//check  column
		for(int i=0;i<boardLength;i++) {
			if(board[i][col]==1) {
				return true;
			}
		}
		//check  diagonal
		
		for(int i=row,j=col;i<boardLength && j<boardLength;i++,j++) {
			if(board[i][j]==1) {
				return true;
			}
		}
		
		for(int i=row-1,j=col-1;i>-1 && j>-1;i--,j--) {
			if(board[i][j]==1) {
				return true;
			}
		}

		for(int i=row-1,j=col+1;i>-1 && j<boardLength;i--,j++) {
			if(board[i][j]==1) {
				return true;
			}
		}
		
		for(int i=row+1,j=col-1;i<boardLength && j>-1;i++,j--) {
			if(board[i][j]==1) {
				return true;
			}
		}
		return false;
	}
	//method to find a given board is NQueens board or not
	static boolean nQueensBoard(int[][] board,int N){
		
		if(N==0) {
			return true;
		}
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(!isAttacked(board, i, j, board.length)) {
					board[i][j]=1;
					if(nQueensBoard(board,N-1)) {
						return true;
					}
					else {
						board[i][j]=0;
					}
					
				}
			}
		}
		return false;
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static double sqrt(long number) {
		double root = 0.0d;
		double square = root;
		while (square < number) {
			++root;
			square = root * root;
		}

		return root;
	}

	static void swap(long number1, long number2) {
		System.out.println("Before ->no1:" + number1 + " no2" + number2);
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		System.out.println("After ->no1:" + number1 + " no2" + number2);
	}

	static void swap(String number1, String number2) {
		System.out.println("Number1" + number1);
		System.out.println("Number2" + number2);
		number1 = number1 + " " + number2;
		System.out.println(number1);
		number2 = number1.substring(0, number1.indexOf(" "));
		number1 = number1.substring(number1.indexOf(" ") + 1, number1.length());

		System.out.println("Number1 " + number1);
		System.out.println("Number2 " + number2);
	}

}
