package be.abis.demo;

public class ScheduleServer {

	public void startBooting() {
		System.out.println("booting");	
	}

	public void readSystemConfigFile() {
		System.out.println("reading sysconfig file");			
	}

	public void init() {
		System.out.println("init");		
	}

	public void initializeContext() {
		System.out.println("initializing context");		
	}

	public void initializeListeners() {
		System.out.println("initializing listeners");		
	}

	public void createSystemObjects() {
		System.out.println("creating system objects");		
	}

	public void releaseProcesses() {
		System.out.println("releasing processes");		
	}

	public void destroy() {
		System.out.println("destroying");	
	}

	public void destroyListeners() {
		System.out.println("destroying listeners");	
	}

	public void destroyContext() {
		System.out.println("destroying context");		
	}

	public void shutdown() {
		System.out.println("shutting down");		
	}

}
