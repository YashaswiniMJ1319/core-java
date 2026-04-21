class FarmHouseRunner{
	
	public static void main(String... var){
		
		FarmHouse farmhouse=new MyFarmHouse();
		farmhouse.growCrops();
		farmhouse.waterPlants();
		farmhouse.feedAnimals();
		farmhouse.harvestCrops();
		farmhouse.maintainFarm();
		
		FarmHouse farmhouse1=new FarmHouse();
		farmhouse1.growCrops();
		farmhouse1.waterPlants();
		farmhouse1.feedAnimals();
		farmhouse1.harvestCrops();
		farmhouse1.maintainFarm();
	}
}