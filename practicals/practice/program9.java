import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken() +",");
		}
	}
}
