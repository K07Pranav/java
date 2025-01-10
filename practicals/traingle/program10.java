import java.io.*;
class Program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());	
		char c='a';
		for(int i=1;i<=rows;i++){
			int n=rows+1;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(n+" ");
				}else{						
					System.out.print(c++ +" ");
				}
				n++;
			}
			System.out.println();
		}
	}
}
