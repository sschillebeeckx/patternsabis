package be.abis.exercise.factory;

import java.util.ArrayList;
import java.util.List;

import be.abis.exercise.model.LaserPrinter;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.PrintServer;
import be.abis.exercise.model.ThreeDimensionalPrinter;
import be.abis.exercise.model.WorkStation;

public class SimpleLanFactory extends LanFactory{
	
	private static SimpleLanFactory instance;
	
	private SimpleLanFactory(){}
    
    public static SimpleLanFactory getInstance(){
		if (instance==null){
			instance=new SimpleLanFactory();
		}
		return instance;
	}

	@Override
	public List<Node> createNodes() {
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(new WorkStation("abc123"));
		nodes.add(new Node("jhy903"));
		nodes.add(new PrintServer("fre943",new LaserPrinter()));		
		nodes.add(new Node("klm009"));
		nodes.add(new PrintServer("frd555",new ThreeDimensionalPrinter()));	
		return nodes;
	}

	
	
	

}
