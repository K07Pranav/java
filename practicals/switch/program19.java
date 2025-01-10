class program19{
	public static void main(String[] args){
		float m1=99.9f;
		float m2=98.9f;
		float m3=97.9f;
		float m4=96.9f;
		float m5=95.9f;
		if(m1>45 && m2>45 && m3>45 && m4>45 && m5>45){
			float sum=m1+m2+m3+m4+m5;
			float per=(sum/500)*100;
			char grade='A';
			if(per>=90)
				grade='O';
			else if(per>=80)
				grade='A';
			else if(per>=70)
				grade='B';
			else if(per>=60)
				grade='C';
			else if(per>=45)
				grade='D';
			switch(grade){
				case 'O': System.out.println("First Class Distiction");
					break;

				case 'A': System.out.println("First Class");
					break;

				case 'B': System.out.println("Second Class");
					  break;

				case 'C': System.out.println("Good");
					  break;

				case 'D': System.out.println("Bad");
					  break;
				
			}
		}else{
			System.out.println("Failed");
		}
	}
}

