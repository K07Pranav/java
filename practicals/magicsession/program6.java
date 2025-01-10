import java.io.*;
class Program6{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter starting point : ");
		int num1=Integer.parseInt(br.readLine());
		System.out.print("Enter ending point : ");
		int num2=Integer.parseInt(br.readLine());
		
		for(int i=num1;i<=num2;i++){
			System.out.println("number : "+i);
		}
	}
}
