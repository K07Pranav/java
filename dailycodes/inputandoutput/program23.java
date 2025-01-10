import java.io.*;
class Program23{
	public static void main(String[] args)throws Exception{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter Name : ");
		String name=br.readLine();
		
		System.out.print("Enter Company Name : ");
		String cmpname=br.readLine();

		System.out.println("Name : "+name);
		System.out.println("Comapny Name : "+cmpname);
	}
}
