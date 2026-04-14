class SolarSystemRunner{
	public static void main(String... args){
		SolarSystem solarSystem=new SolarSystem();
		solarSystem.save("Sun");
		solarSystem.save("Mercury");
		solarSystem.save("Venus");
		solarSystem.save("Earth");
		solarSystem.save("Mars");
		//solarSystem.save("Jupiter");
		
		solarSystem.store("Sun");
		solarSystem.store("Jupiter");
		
	}
}