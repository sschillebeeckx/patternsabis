package be.abis.demo;

public class ScheduleServerFacade {

	private ScheduleServer scheduleServer;

	public ScheduleServerFacade(ScheduleServer scheduleServer) {
		this.scheduleServer = scheduleServer;
	}

	public void startServer() {
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
	}

	public void stopServer() {
		scheduleServer.releaseProcesses();
		scheduleServer.destroy();
		scheduleServer.createSystemObjects();
		scheduleServer.destroyListeners();
		scheduleServer.destroyContext();
		scheduleServer.shutdown();
	}

}
