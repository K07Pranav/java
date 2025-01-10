import java.util.*;
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String to Tokenize : ");
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str," ");
		String fname=st.nextToken();
		String mname=st.nextToken();
		String lname=st.nextToken();

		System.out.println("First Name : "+fname);
		System.out.println("Middle Name : "+mname);
		System.out.println("Last Name : "+lname);
	}
}
