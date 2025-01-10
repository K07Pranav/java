import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Kindly enter only Integer values : ");
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens()){
			Integer b=Integer.parseInt(st.nextToken());
			System.out.println(b);
		}
	}
}
