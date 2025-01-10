import java.io.*;
class Program11{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());	
		char c='a';
		int n=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(n+" ");
				}else{						
					System.out.print(c+" ");
				}
				n++;
				c++;
			}
			System.out.println();
		}
	}
}
