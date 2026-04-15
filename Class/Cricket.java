class Cricket{
	String teamName;
	double budget;
	int playersCount;
	String captain;
	boolean hasCoach;
	int trophies;
	boolean isInternational;
	String jerseyColor;
	boolean isChampion;
	double ranking;

	Cricket(String teamName,double budget,int playersCount,String captain,boolean hasCoach,
	int trophies,boolean isInternational,String jerseyColor,boolean isChampion,double ranking){
		this.teamName=teamName;
		this.budget=budget;
		this.playersCount=playersCount;
		this.captain=captain;
		this.hasCoach=hasCoach;
		this.trophies=trophies;
		this.isInternational=isInternational;
		this.jerseyColor=jerseyColor;
		this.isChampion=isChampion;
		this.ranking=ranking;
	}

	void display(){
		System.out.println("displaying the properties of cricket");
		System.out.println("teamName:"+teamName);
		System.out.println("budget:"+budget);
		System.out.println("playersCount:"+playersCount);
		System.out.println("captain:"+captain);
		System.out.println("hasCoach:"+hasCoach);
		System.out.println("trophies:"+trophies);
		System.out.println("isInternational:"+isInternational);
		System.out.println("jerseyColor:"+jerseyColor);
		System.out.println("isChampion:"+isChampion);
		System.out.println("ranking:"+ranking);
	}
}

