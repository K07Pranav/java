class program19{
	public static void main(String[] args){
		String p="sid";
		System.out.println("Before switch");
		switch(p){
			case "sid": System.out.println("Naik Siddhesh");
				break;

			case "sam": System.out.println("Naik Samar");
				break;

			case "sanvi": System.out.println("Naik Sanvi");
				break;

			default : System.out.println("in default");
		}
		System.out.println("After switch");
	}
}
