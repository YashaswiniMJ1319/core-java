class Stock{
	
	String stockName;
	String symbol;
	double price;
	int quantity;
	String exchange;
	
	Stock(String stockName,String symbol){
		this.stockName=stockName;
		this.symbol=symbol;
		
	}
	
	Stock(String stockName,String symbol,double price,int quantity,String exchange){
		this(stockName,symbol);
		this.price=price;
		this.quantity=quantity;
		this.exchange=exchange;
	}

}