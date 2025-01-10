import java.io.*;
class program3{
	public static void main(String[] args)throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.print("Enter your name : ");
		String name=br.readLine();
		System.out.println();
		System.out.println("Name : "+name);
	}
}
