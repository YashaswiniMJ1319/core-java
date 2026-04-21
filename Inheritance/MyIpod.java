class MyIpod extends Ipod {

    @Override
    void playMusic() { 
	System.out.println("playing music in child");
	}
	void pauseMusic() { 
	System.out.println("pausing music in child"); 
	}
	void nextSong() { 
	System.out.println("next song in child"); 
	}
}

