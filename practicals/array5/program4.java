import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int flag=0;
		int p=0;
		for(int i=0;i<arr.length;i++){
			int s=arr[i];
			for(int j=0;j<arr.length;j++){
				if(i==j)
					continue;
				if(s==arr[j]){
					flag=1;
					break;
				}
			}
			if(flag==1){
				p=i;
				break;
			}
		}
		if(flag==1)
				System.out.println("First duplicate eleement present at index : "+p);
		
	}
}
