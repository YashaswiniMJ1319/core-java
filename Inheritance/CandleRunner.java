class CandleRunner{
	
	public static void main(String... args){
		
		Candle candle=new RedCandle(10);
		System.out.println("number:"+candle.number);
		candle.number=14;
		System.out.println("number:"+candle.number);
	}
}