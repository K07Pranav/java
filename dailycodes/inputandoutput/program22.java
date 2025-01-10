import java.io.*;
class Program22{
	public static void main(String[] args)throws IOException{

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
