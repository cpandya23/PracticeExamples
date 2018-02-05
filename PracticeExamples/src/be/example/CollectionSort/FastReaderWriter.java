package CollectionSort;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FastReaderWriter {
     public static void main(String args[] ) throws Exception {
	       
    	 FastReader scan = new FastReader();
	   
    	 BufferedOutputStream out=new BufferedOutputStream(System.out);
		    int testCases=scan.nextInt();
		    StringBuilder output=new StringBuilder();
		    long input;
		    long temp1=0;
		  
		    while(testCases>0){
		        input=scan.nextLong();
		        while(input>0) {
		        	input=input & (input-1);
		        	++temp1;
		        }
		        output.append(temp1+"\n");
		        temp1=0;
		        --testCases;
		    }
		   /* System.out.println(output);*/
		    out.write(output.toString().getBytes());
			out.flush();
		    
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
	 /*static class Reader {
		    final private int BUFFER_SIZE = 1 << 16;
		    private DataInputStream din;
		    private byte[] buffer;
		    private int bufferPointer, bytesRead;
		 
		    public Reader() {
		        din = new DataInputStream(System.in);
		        buffer = new byte[BUFFER_SIZE];
		        bufferPointer = bytesRead = 0;
		    }
		 
		    public Reader(String file_name) throws IOException {
		        din = new DataInputStream(new FileInputStream(file_name));
		        buffer = new byte[BUFFER_SIZE];
		        bufferPointer = bytesRead = 0;
		    }
		 
		    public String readLine() throws IOException {
		        byte[] buf = new byte[64];
		        int cnt = 0, c;
		        while ((c = read()) != -1) {
		            if (c == '\n') break;
		            buf[cnt++] = (byte) c;
		        }
		        return new String(buf, 0, cnt);
		    }
		 
		    public int nextInt() throws IOException {
		        int ret = 0;
		        byte c = read();
		        while (c <= ' ') c = read();
		        boolean neg = (c == '-');
		        if (neg) c = read();
		        do {
		            ret = ret * 10 + c - '0';
		        } while ((c = read()) >= '0' && c <= '9');
		        if (neg) return -ret;
		        return ret;
		    }
		 
		    public long nextLong() throws IOException {
		        long ret = 0;
		        byte c = read();
		        while (c <= ' ') c = read();
		        boolean neg = (c == '-');
		        if (neg) c = read();
		        do {
		            ret = ret * 10 + c - '0';
		        } while ((c = read()) >= '0' && c <= '9');
		        if (neg) return -ret;
		        return ret;
		    }
		 
		    public double nextDouble() throws IOException {
		        double ret = 0, div = 1;
		        byte c = read();
		        while (c <= ' ') c = read();
		        boolean neg = (c == '-');
		        if (neg) c = read();
		        do {
		            ret = ret * 10 + c - '0';
		        } while ((c = read()) >= '0' && c <= '9');
		        if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
		        if (neg) return -ret;
		        return ret;
		    }
		 
		    private void fillBuffer() throws IOException {
		        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		        if (bytesRead == -1) buffer[0] = -1;
		    }
		 
		    private byte read() throws IOException {
		        if (bufferPointer == bytesRead) fillBuffer();
		        return buffer[bufferPointer++];
		    }
		 
		    public void close() throws IOException {
		        if (din == null) return;
		        din.close();
		    }
		}*/
}