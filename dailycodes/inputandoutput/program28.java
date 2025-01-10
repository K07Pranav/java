import java.io.*;
class Program28{
	public static void main(String[] arrgs)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name=br.readLine();
		br.close();

		System.out.print("Enter society name : ");
		String socname=br.readLine();

		System.out.print("Enter wing : ");
		String wing=br.readLine();
		
		System.out.print("Enter FlatNo : ");
		String flatNo=br.readLine();

		System.out.println(name);
		System.out.println(socname);
		System.out.println(wing);
		System.out.println(flatNo);
	}
}
