class program9{
	public static void main(String[] args){
		float m1=99.9f;
		float m2=98.9f;
		float m3=97.9f;
		float m4=99.9f;
		float m5=95.9f;
		float total=0f;
		
		if(m1>=45 && m2>=45 &&  m3>=45 && m4>=45 && m5>=45){
			total=m1+m2+m3+m4+m5;
			float per=(total/500)*100;
			if(per>=80){
				System.out.println("First Class distinction");
			}else if(per>=65){
				System.out.println("First Class");
			}else if(per>=50){
				System.out.println("Second Class");
			}else{
				System.out.println("Failed");
			}
			System.out.println("Percentage : "+per);
		}else{
			System.out.println("You are failed!");
		}
	}
}
