import java.io.*;
class Program5{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());
		for(int i=1;i<=rows;i++){
			char c=(char)(64+rows);
			char c1=(char)(96+rows);
			if(i%2==1){
				for(int j=1;j<=i;j++){
					System.out.print(c1-- +" ");
				}
			}else{
				for(int j=1;j<=i;j++){
					System.out.print(c-- +" ");
				}
			}
			System.out.println();
		}
	}
}
