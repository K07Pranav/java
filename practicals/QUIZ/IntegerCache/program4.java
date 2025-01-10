class Program4{
	public static void main(String[] args){
		int x=10;
		int y=x+0;

		int arr[]={x,y};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
	}
}
