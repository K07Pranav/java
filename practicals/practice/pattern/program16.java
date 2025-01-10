class program16{
	public static void main(String[] args){
		short rows=100;
		for(short i=1;i<=rows;i++){
			for(short k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(short j=1;j<=1;j++){
				System.out.print("*");
			}
			if(i==rows){
				for(short r=1;r<=rows*2-2;r++){
					System.out.print("*");
				}
			}
			for(short p=4;p<=i*2;p++){
				System.out.print(" ");
			}
			if(i>=2 && i<rows){
				for(short s=3;s<=3;s++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
