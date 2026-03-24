class FoodIngredients{
	public static void main(String[] args){
		
		String[] names={"Dosa","Idle","Pizza","Pongal","Palav","chapathi","roti","butter chicken","aloo gobi","Veg Fried Rice","Chicken Curry","Sambar","Upma","Maggi Noodles","Egg Curry","Fish Fry","Palak Paneer","Burger","Sandwich","Pani Puri","Kheer","Gulab Jamun","Ice Cream","Chocolate Cake","Vada Pav","Hakka Noodles","Momos","Tandoori Chicken","Malai Kofta","Pesarattu","Shahi Paneer"};
		System.out.println("Number of items in the menue:"+names.length);
		for(int items=0;items<names.length;items++){
			String[] fooditems=FoodItems.getItemsName(names[items]);
		
		if(fooditems!=null){
			for(String ing:fooditems){
				System.out.println("ingredients:"+ing);
			}
		}
		}
	}
}