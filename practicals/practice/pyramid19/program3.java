import java.util.*;
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		int n=1;
		for(int i=1;i<=size;i++){
			for(int s=1;s<=size-i;s++){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(n++ +"\t");
			}
			System.out.println();
		}
	}
}
