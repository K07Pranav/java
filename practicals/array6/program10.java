import java.util.*;
class Thirdlargest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		int max1=-2147483648;
		int max2=-2147483648;
		int max3=-2147483648;

		for(int i=0;i<size;i++){
			if(arr[i]>max1){
				max1=arr[i];
			}
		}
		
		for(int i=0;i<size;i++){
			if(arr[i]==max1){
				continue;
			}
			if(arr[i]>max2){
				max2=arr[i];
			}
		}
		
		for(int i=0;i<size;i++){
			if(arr[i]==max1){
				continue;
			}
			if(arr[i]==max2){
				continue;
			}
			if(arr[i]>max3){
				max3=arr[i];
			}
		}

		System.out.println("Third largest Element is : "+max3);

	}
}
