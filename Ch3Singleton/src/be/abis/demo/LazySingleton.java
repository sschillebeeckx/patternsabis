package be.abis.demo;

import java.io.FileNotFoundException;

public class LazySingleton {
	
	private static LazySingleton instance=null;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance() {
		if (instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}

}
