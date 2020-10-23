package be.abis.demo;


public class TestObserver {

	public static void main(String[] args) {
		Person p1 = new Person("Jane", "Doe");
				
		Friend f1 = new Friend("Jef");
		Friend f2 = new Friend("John");
		Friend f3 = new Friend("Jana");
		Friend f4 = new Friend("Joost");
		Friend f5 = new Friend("Janice");
		
		Friend[] friends = {f1,f2,f3,f4,f5};
		
		for (Friend f: friends){
			p1.addCelebrationListener(f);
		}
		
	
        p1.notifyCelebrationComingUp("birthday", "10/4/2018");
		
         
        

		

           
		

	}

}
