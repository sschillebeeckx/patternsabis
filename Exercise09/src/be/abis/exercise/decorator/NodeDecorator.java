package be.abis.exercise.decorator;

public class NodeDecorator implements DecoratorComponent{
	
	private DecoratorComponent component;

	public NodeDecorator(DecoratorComponent component) {
		this.component = component;
	}
	
	public DecoratorComponent getComponent() {
		return component;
	}

	public void draw(){
		component.draw();
	}
	
	

}
