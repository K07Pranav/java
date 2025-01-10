class realtime{
	public static void main(String[] args){
		float amt=1000f;
		
		float cgst=amt*0.18f;
		float sgst=amt*0.18f;	
		if(amt>=500){
			System.out.println("Total bill(including cgst and sgst) "+(amt+cgst+sgst));
		}
		else{
			System.out.println("Total bill "+amt);
		}
	}
}
