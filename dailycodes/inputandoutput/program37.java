import java.util.*;
class Program37{
	public static void main(String[] arrgs){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.next();

		System.out.print("Enter society name : ");
		String socname=sc.next();

		System.out.print("Enter wing : ");
		char wing=sc.next().charAt(0);
		
		System.out.print("Enter FlatNo. : ");
		int flatNo=sc.nextInt();
		
		System.out.println(name);
		System.out.println(socname);
		System.out.println(wing);
		System.out.println(flatNo);
	}
}
