import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Float value : ");
		float fNum=sc.nextFloat();
		System.out.print("Enter int value : ");
		int iNum=sc.nextInt();
		System.out.print("Enter boolean value : ");
		boolean bool =sc.nextBoolean();
		
		for(int i=1;i<=3;i++){
			if(i==1){
				System.out.print(fNum+" ");
			}
			if(i==2){
				System.out.print(iNum+" ");
			}
			if(i==3){
				System.out.print(bool+" ");
			}
		}
	}
}
