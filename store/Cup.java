class Cup{
   int[] number=new int[5];
   int index=0;
   void save(int number){
	   System.out.println("getting the details");
	   if(number!=0){
		   System.out.println("getting the number");
		   if(this.index<this.number.length){
			   System.out.println("getting the number within the range");
			   this.number[this.index]=number;
			   System.out.println("getting the position of the cups:"+this.index);
				System.out.println("getting the details of the cups:"+number);
				this.index++;
		   }
		   else{
			   System.out.println("not present");
		   }
	   }
	   else{
		   System.out.println("out of range");
	   }
	   }
   
   void store(int nums){
	   boolean found=false;
	   if(nums!=0){
		   for(int temp:number){
			   if(nums==temp){
				   System.out.println("the give name is stored:"+nums);
				   found=true;
				   break;
				   
			   }
		   }
			   if(!found){
				   System.out.println("number not present");
			   }
		   }
	   
   }
}
