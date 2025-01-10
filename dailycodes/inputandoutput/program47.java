import java.util.*;
class Program47{
	public static void main(String[] arrgs){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Info : ");
		String info=sc.nextLine();
		StringTokenizer st=new StringTokenizer(info,",@");

		while(st.hasMoreTokens())
		System.out.println(st.nextToken());
	}
}
