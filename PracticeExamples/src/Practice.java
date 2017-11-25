
public class Practice {
	public static void main(String[] args) {
	
		String x= "000012356090";
		char c[]= x.toCharArray();
		int temp=-1;
		for(int i=0;i<c.length;i++) {
		
			if(c[i]!='0') {
				temp=i;
				i=c.length;
				
			}
		}
		System.out.println(x.substring(temp));
	}
}
