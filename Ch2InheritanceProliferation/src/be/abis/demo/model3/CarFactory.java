package be.abis.demo.model3;

public class CarFactory {
	
	public static BaseCar makeToyotaCorolla(){
		
	    BaseWheel frontLeft=new Wheel("front left");
	    BaseWheel frontRight=new Wheel("front right");
	    BaseWheel rearLeft=new Wheel("rear left");
	    BaseWheel rearRight=new Wheel("rear right");
	    
		BaseCar toyotaCorolla = new Car(frontLeft,frontRight,rearLeft,rearRight,
				                    new FrontWheelDrive(frontLeft,frontRight),
				                    new FrontSteering(frontLeft,frontRight),
				                    Toyota.getInstance());		
		return toyotaCorolla;
	}
	
	public static BaseCar makeToyotaCorollaSport(){
		
	    BaseWheel frontLeft=new Wheel("front left");
	    BaseWheel frontRight=new Wheel("front right");
	    BaseWheel rearLeft=new Wheel("rear left");
	    BaseWheel rearRight=new Wheel("rear right");
	    
		BaseCar toyotaCorollaSport = new Car(frontLeft,frontRight,rearLeft,rearRight,
				                    new RearWheelDrive(rearLeft,rearRight),
				                    new FrontSteering(frontLeft,frontRight),
				                    Toyota.getInstance());		
		return toyotaCorollaSport;
	}
	
	public static BaseCar makeHondaCivic(){
		
		 BaseWheel frontLeft=new Wheel("front left");
		 BaseWheel frontRight=new Wheel("front right");
		 BaseWheel rearLeft=new Wheel("rear left");
		 BaseWheel rearRight=new Wheel("rear right");
		    
		BaseCar hondaCivic = new Car(frontLeft,frontRight,rearLeft,rearRight,
                                         new FrontWheelDrive(frontLeft,frontRight),
				                         new FrontSteering(frontLeft,frontRight),
				                         Honda.getInstance());		
		return hondaCivic;
	}
	
	public static BaseCar makeHondaCivicSport(){
		
		 BaseWheel frontLeft=new Wheel("front left");
		 BaseWheel frontRight=new Wheel("front right");
		 BaseWheel rearLeft=new Wheel("rear left");
		 BaseWheel rearRight=new Wheel("rear right");
		 
		 BaseCar hondaCivicSport =new Car(frontLeft,frontRight,rearLeft,rearRight,
				                    new RearWheelDrive(rearLeft,rearRight),
				                    new FrontSteering(frontLeft,frontRight),
				                    Honda.getInstance());		
		return hondaCivicSport;
	}

}
