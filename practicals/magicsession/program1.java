import java.util.*;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		if(num%2==0){
			System.out.println(num+" is an even number");
		}else{
			System.out.println(num+" is an odd number");
		}
	}
}
