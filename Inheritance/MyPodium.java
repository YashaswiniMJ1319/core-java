class MyPodium extends Podium {

    @Override
    void speak() { 
	System.out.println("speaking on podium in child"); 
	}
    void adjustHeight() { 
	System.out.println("adjusting height in child"); 
	}
    void cleanPodium() { 
	System.out.println("cleaning podium in child");
	}
}

