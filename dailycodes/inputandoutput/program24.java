import java.io.*;
class Program24{
	public static void main(String[] args)throws Exception{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter Name : ");
		String name=br.readLine();
		
		System.out.print("Enter Company Name : ");
		String cmpname=br.readLine();

		System.out.print("Enter Employee ID : ");
		int empid=br.readLine();

		System.out.println("Name : "+name);
		System.out.println("Comapny Name : "+cmpname);
		System.out.println("Employee ID : "+empid);
	}
}
