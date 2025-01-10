import java.io.*;
class Program7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());
		char c='A';
		for(int i=1;i<=rows;i++){
			int c1=1;
			if(i%2==1){
				for(int j=1;j<=i;j++){
					System.out.print(c1++ +" ");
					c++;
				}
			}else{
				for(int j=1;j<=i;j++){
					System.out.print(c++ +" ");
				}
			}
			System.out.println();
		}
	}
}
