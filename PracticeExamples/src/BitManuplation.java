import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BitManuplation {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.println(powerOfTwo(sc.nextLong()));
		//System.out.println(numberOfOnes(sc.nextLong()));
		
		System.out.println(checkGivenBitIsSet(2,4));
	
		
	
	}
	
	static boolean powerOfTwo(long number) {
		if((number & number-1)==0)return true;
		return false;
	}
	
	static long numberOfOnes(long number) {
		long count=0;
		while(number>0){
			number= number&(number-1);
			count++;
		}
		return count;
	}
	
	static boolean checkGivenBitIsSet(long bit,long number) {
		
		if((number & (long)(Math.pow(2, bit)))>0) 	return true;
		return false;
		
	}
}
