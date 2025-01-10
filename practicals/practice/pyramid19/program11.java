import java.util.*;
class Program11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		char ch=(char)(64+size);
		for(int i=1;i<=size;i++){
			for(int s=1;s<=size-i;s++){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(i>j)
				System.out.print(ch++ +"\t");
				else
				System.out.print(ch-- +"\t");
			}
		
			System.out.println();
		}
	}
}
