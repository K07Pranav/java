import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Kindly enter values : ");
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str,"2");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
	}
}
