import java.io.*;
class Program8{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter starting point : ");
		int num1=Integer.parseInt(br.readLine());
		System.out.print("Enter ending point : ");
		int num2=Integer.parseInt(br.readLine());
		int sum=0;

		for(int i=num1;i<=num2;i++){
			sum+=i;
		}
		System.out.println("sum : "+sum);
	}
}
