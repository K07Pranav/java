import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int jerNo=0;
		for(int i=1;i<=5;i++){
			System.out.println("Enter jersy no. for player : "+i);
			jerNo=sc.nextInt();
			System.out.println("JersyNo : "+jerNo);
		}
	}
}
