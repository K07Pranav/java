import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens()){
			System.out.print(st.nextToken()+" ");//return string
		}
	}
}
