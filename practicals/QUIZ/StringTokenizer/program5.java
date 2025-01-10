import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Kindly enter only float values : ");
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str,".");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
