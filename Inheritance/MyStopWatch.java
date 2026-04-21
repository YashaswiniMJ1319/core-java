class MyStopWatch extends StopWatch {

    @Override
    void start() { 
	System.out.println("starting stopwatch in child"); 
	}
	
	void stop() { 
	System.out.println("stopping stopwatch in child"); 
	}
	void reset() { 
	System.out.println("resetting stopwatch in child"); 
	}
}

