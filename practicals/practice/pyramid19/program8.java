import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();

		for(int i=1;i<=size;i++){
			for(int s=1;s<=size-i;s++){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(i%2==0)
				System.out.print((char)(64+i)+"\t");
				else
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
}
