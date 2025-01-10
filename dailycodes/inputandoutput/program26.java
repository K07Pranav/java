import java.io.*;
class Program26{
	public static void main(String[] args)throws Exception{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter Name : ");
		String name=br.readLine();
		
		System.out.print("Enter Company Name : ");
		String cmpname=br.readLine();

		System.out.print("Enter Employee ID : ");
		int empid=Integer.parseInt(br.readLine());

		System.out.print("Enter Employee Salary : ");
		Double empsal=Double.parseDouble(br.readLine());

		System.out.println("Name : "+name);
		System.out.println("Comapny Name : "+cmpname);
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Salary : "+empsal);
	}
}
