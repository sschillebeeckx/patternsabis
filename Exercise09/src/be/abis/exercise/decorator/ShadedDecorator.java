package be.abis.exercise.decorator;

public class ShadedDecorator extends NodeDecorator {

	public ShadedDecorator(DecoratorComponent component) {
		super(component);
	}
	
	@Override
	public void draw(){
		this.getComponent().draw();
		System.out.println("shading the circle");
	}

}
