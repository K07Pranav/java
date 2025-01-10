import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Kindly enter only boolean values : ");
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens()){
			boolean b=Boolean.parseBoolean(st.nextToken());
			System.out.println(b);
		}
	}
}
