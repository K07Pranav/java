import java.util.*;
class Program5{
	public static void main(String[] args){
		String str="Core2web@biencaps";

		StringTokenizer st=new StringTokenizer(str,"2@");

		System.out.println(st.countTokens());
	}
}
