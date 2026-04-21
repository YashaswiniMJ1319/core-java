class StockRunner{
	
	public static void main(String... args){
		
		Stock stock=new Stock("kurtha","flower",45.67,30,"available");
		System.out.println("stockName:"+stock.stockName);
		System.out.println("symbol:"+stock.symbol);
		System.out.println("price:"+stock.price);
		System.out.println("quantity:"+stock.quantity);
		System.out.println("exchange:"+stock.exchange);
		
	}
}