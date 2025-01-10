import java.io.*;
class Program6{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());
		char c=(char)(64+rows+1);
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
}
