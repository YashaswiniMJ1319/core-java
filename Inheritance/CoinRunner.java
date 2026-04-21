class CoinRunner{
	
	public static void main(String... args){
		
		Coin coin=new Coin("India",20,"gold",20.4,2000);
		System.out.println("country:"+coin.country);
		System.out.println("value:"+coin.value);
		System.out.println("material:"+coin.material);
		System.out.println("weight:"+coin.weight);
		System.out.println("year:"+coin.year);
	}
}