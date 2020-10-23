package be.abis.exercise.factory;

import java.util.ArrayList;
import java.util.List;

import be.abis.exercise.adapter.TapeStreamerAdapter;
import be.abis.exercise.model.FileServer;
import be.abis.exercise.model.LaserPrinter;
import be.abis.exercise.model.MQServer;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.PrintServer;
import be.abis.exercise.model.ThreeDimensionalPrinter;
import be.abis.exercise.model.WorkStation;

public class ExtendedLanFactory extends LanFactory{
	
private static ExtendedLanFactory instance;
	
	private ExtendedLanFactory(){}
    
    public static ExtendedLanFactory getInstance(){
		if (instance==null){
			instance=new ExtendedLanFactory();
		}
		return instance;
	}

	@Override
	public List<Node> createNodes() {
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(new WorkStation("abc123"));
		nodes.add(new PrintServer("fre943",new LaserPrinter()));
		nodes.add(new Node("jhy903"));
		nodes.add(new FileServer("sdt287"));
		nodes.add(new Node("klm009"));	
		nodes.add(new PrintServer("frd555",new ThreeDimensionalPrinter()));	
		nodes.add(new FileServer("alk309"));
		nodes.add(new MQServer("jkl456"));	
		nodes.add(new Node("mlk019"));
		nodes.add(new TapeStreamerAdapter("xrz147"));
		return nodes;
	}

	
	
	

}

