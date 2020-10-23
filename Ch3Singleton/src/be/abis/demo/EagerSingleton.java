package be.abis.demo;

import java.io.FileNotFoundException;

public class EagerSingleton {
	
	private static EagerSingleton instance;
	static {
	    try {
			instance =new EagerSingleton();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private EagerSingleton() throws FileNotFoundException
	{}
	
	public static EagerSingleton getInstance(){
		return instance;
	}

}
