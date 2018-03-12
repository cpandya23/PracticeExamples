package CollectionSort;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


import java.util.StringTokenizer;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PossibleSubsets {
	public static void main(String args[] ) throws Exception {
		
	    FastReader scan = new FastReader();
		   
	    	 BufferedOutputStream out=new BufferedOutputStream(System.out);
			    int testCases=scan.nextInt();
			    StringBuilder output=new StringBuilder();
			    	
			   while(testCases>0){
				
				   int length= scan.nextInt();
				   long[] input= new long[length];
				   for(int i=0;i<length;i++) {
					   input[i]=scan.nextLong();
					   
				   }
				   for(String i:possibleSubsets(input)) {
					   System.out.println(i);
				   }
				   output.append(possibleSubsets(input)+"\n");
			       --testCases;
			    }
			 
			   // out.write(output.toString().getBytes());
			   
				out.flush();
				
				
			
		    }
	
	static String[] possibleSubsets(long[] input) {
		String outputArray[]=new String[1<<input.length];
		String output="";
		for(int i=0;i<(1<<input.length);i++) {
			for(int j=0;j<input.length;j++) {
				if((i & (1<<j))>0) {
					
					output=output+input[j]+" ";
				}
			}
			//System.out.println(output);
			//System.out.println(output.lastIndexOf(","));
			
			outputArray[i]=output;	
			output="";
		}
		return outputArray;
	}
	static long numBits(long num) {
		long count=0;
		while((num& num-1)>0) {
			++count;
			num=num&num-1;
		}
		return count;
	}
	     static class FastReader
	     {
	         BufferedReader br;
	         StringTokenizer st;
	  
	         public FastReader()
	         {
	             br = new BufferedReader(new
	                      InputStreamReader(System.in));
	         }
	  
	         String next()
	         {
	             while (st == null || !st.hasMoreElements())
	             {
	                 try
	                 {
	                     st = new StringTokenizer(br.readLine());
	                 }
	                 catch (IOException  e)
	                 {
	                     e.printStackTrace();
	                 }
	             }
	             return st.nextToken();
	         }
	  
	         int nextInt()
	         {
	             return Integer.parseInt(next());
	         }
	  
	         long nextLong()
	         {
	             return Long.parseLong(next());
	         }
	  
	         double nextDouble()
	         {
	             return Double.parseDouble(next());
	         }
	  
	         String nextLine()
	         {
	             String str = "";
	             try
	             {
	                 str = br.readLine();
	             }
	             catch (IOException e)
	             {
	                 e.printStackTrace();
	             }
	             return str;
	         }
	     }
	     
	     static double sqrt(long number) {
	    	 double root=0.0d;
	    	 double square=root;
	    	 while(square<number) {
	    		 ++root;
	    		 square= root*root;
	    	}
	    	 
	    	 return root;
	     }
	     
	     static void swap(long number1,long number2) {
	    	 System.out.println("Before ->no1:"+number1+" no2"+number2);
	    	 number1=number1^number2;
	    	 number2=number1^number2;
	    	 number1=number1^number2;
	    	 System.out.println("After ->no1:"+number1+" no2"+number2);
	     }
	     static void swap(String number1,String number2) {
	    	 System.out.println("Number1"+number1);
	    	 System.out.println("Number2"+number2);
	    	 number1=number1+" "+number2;
	    	 System.out.println(number1);
	    	 number2= number1.substring(0, number1.indexOf(" "));
	    	 number1= number1.substring(number1.indexOf(" ")+1, number1.length());
	    	 
	    	 System.out.println("Number1 "+number1);
	    	 System.out.println("Number2 "+number2);
	     }
}