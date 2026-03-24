class FoodItems{
	static String[] getItemsName(String items){
		System.out.println("Executing our food menue");
		if(items==null){
			System.out.println("it is an invalid one");
			return null;
		}
		System.out.println("The item exist:"+items);
		if(items=="Dosa"){
			String[] ingredients={"Rice","Urad dal","Water","salt","oil"};
			return ingredients;
		}
		if(items=="Idle"){
			String[] ingredients={"Rice","Urad dal","Water","salt","oil"};
			return ingredients;
		}
		if(items=="Pizza"){
			String[] ingredients={"Flour","Cheese","Tomato sauce","Vegetables"};
			return ingredients;
		}
		if(items=="Pongal"){
			String[] ingredients={"Rice","water","Peper","chilly","turmeric"};
			return ingredients;
		}
		if(items=="Palav"){
			String[] ingredients={"Rice","water","vegitables","chilly","tomato","salt","garam masala"};
			return ingredients;
		}
		if(items=="chapathi"){
			String[] ingredients={"wheat flour","water","salt","oil"};
			return ingredients;
		}
		if(items=="roti"){
			String[] ingredients={"rice flour","water","salt"};
			return ingredients;
		}
		if(items=="butter chicken"){
			String[] ingredients={"chicken","water","salt","tomato","ginger-garlic past","garam masala","butter"};
			return ingredients;
		}
		if(items=="aloo gobi"){
			String[] ingredients={"potatoes","cauliflower","turmeric","cumin","ginger","green chill","oil"};
			return ingredients;
		}
		if(items=="Veg Fried Rice"){
			String[] ingredients={"Rice", "vegetables", "soy sauce", "garlic", "oil"};
			return ingredients;
		}
		if(items=="Chicken Curry"){
			String[] ingredients={"Chicken", "onion", "tomato","spices","oil"};
			return ingredients;
		}
		if(items=="Sambar"){
			String[] ingredients={"Toor dal","vegetables","tamarind","spices"};
			return ingredients;
		}
		if(items=="Upma"){
			String[] ingredients={"Semolina", "vegetables","mustard seeds","curry leaves"};
			return ingredients;
		}
		if(items=="Maggi Noodles"){
			String[] ingredients={"Noodles","tastemaker","water"};
			return ingredients;
		}
		if(items=="Egg Curry"){
			String[] ingredients={"Eggs","onion","tomato","spices"};
			return ingredients;
		}
		if(items=="Fish Fry"){
			String[] ingredients={"Fish","spices","oil","lemon"};
			return ingredients;
		}
		if(items=="Palak Paneer"){
			String[] ingredients={"Spinach","paneer","spices","cream"};
			return ingredients;
		}
		if(items=="Burger"){
			String[] ingredients={"Bun","patty","lettuce","tomato","sauce"};
			return ingredients;
		}
		if(items=="Sandwich"){
			String[] ingredients={"Bread","vegetables","butter","chutney"};
			return ingredients;
		}
		if(items=="Pani Puri"){
			String[] ingredients={"Puri","potato","chickpeas","tamarind water"};
			return ingredients;
		}
		if(items=="Kheer"){
			String[] ingredients={"Milk","rice","sugar","dry fruits"};
			return ingredients;
		}
		if(items=="Gulab Jamun"){
			String[] ingredients={"Milk powder","sugar syrup","ghee"};
			return ingredients;
		}
		if(items=="Ice Cream"){
			String[] ingredients={"Milk","sugar","cream","flavoring"};
			return ingredients;
		}
		if(items=="Chocolate Cake"){
			String[] ingredients={"Flour","cocoa powder","sugar","eggs"};
			return ingredients;
		}
		if(items=="Vada Pav"){
			String[] ingredients={"Pav bread","potato vada","garlic chutney","green chutney"};
			return ingredients;
		}
		if(items=="Hakka Noodles"){
			String[] ingredients={"Noodles","vegetables","soy sauce","garlic","oil"};
			return ingredients;
		}
		if(items=="Momos"){
			String[] ingredients={"Flour","vegetables","chicken filling","spices"};
			return ingredients;
		}
		if(items=="Tandoori Chicken"){
			String[] ingredients={"Chicken","yogurt","spices","lemon juice"};
			return ingredients;
		}
		if(items=="Malai Kofta"){
			String[] ingredients={"Paneer","potato","cream","spices"};
			return ingredients;
		}
		if(items=="Pesarattu"){
			String[] ingredients={"Green gram","ginger","green chili"};
			return ingredients;
		}
		if(items=="Shahi Paneer"){
			String[] ingredients={"Paneer","cream","cashew paste","spices"};
			return ingredients;
		}
		
		
		else
		{
			System.out.println("Food item not found");
			return null;
		}
	}
}