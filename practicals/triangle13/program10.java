import java.util.Scanner;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			char ch1=(char)(64+rows-i+1);
			char ch2=(char)(96+rows-i+1);
			for(int j=rows;j>=i;j--){
				if(rows%2==0){
					if(i%2==1){
						System.out.print(ch1-- +" ");
					}else{
						System.out.print(ch2-- +" ");
					}
				}else{
					if(i%2==1){
						System.out.print(ch2-- +" ");
					}else{
						System.out.print(ch1-- +" ");
					}
				}
			
			}
			System.out.println();
		}

	}
}
