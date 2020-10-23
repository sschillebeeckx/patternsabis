package be.abis.exercise.decorator;

public class TextDecorator extends NodeDecorator {

	public TextDecorator(DecoratorComponent component) {
		super(component);
	}
	
	@Override
	public void draw(){
		DecoratorComponent comp = this.getComponent();
		String type=null;
		if (comp instanceof NodeDecorator){
			type = (((NodeDecorator) comp).getComponent()).getClass().getSimpleName();
		} else {
			type=comp.getClass().getSimpleName();
		}
		comp.draw();
		System.out.println("writing: " + type + " in circle");
	}

}
