package be.abis.demo;


public class TestSingleton {

	public static void main(String[] args) {

       EagerSingleton es = null;

       
       es= EagerSingleton.getInstance();
       
       
       EagerSingleton es2 = EagerSingleton.getInstance();
       

		LazySingleton ls = LazySingleton.getInstance();

	}

}
