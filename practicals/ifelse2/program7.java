class selling{
	public static void main(String[] args){
		int sellingprice=1200;
		int costprice=1000;
		
		int op=sellingprice-costprice;
		int p=costprice-sellingprice;

		if(sellingprice>costprice){
			System.out.println("Profit of "+op);
		}
		else if(sellingprice<costprice){
			System.out.println("loss of "+p);
		}else{
			System.out.println("No profit no loss");
		}
		
	}
}
