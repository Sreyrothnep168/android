package andorid;

public class HelloWorld {
	public static void main(String[]args){
		System.out.println("number"+sum(1,10));
	}
	public static int sum(int start,int end){
		int sum = 0 ;
		for(int i = start;i<=end;i++)
			sum +=1;
		return sum;
		
	}
}
