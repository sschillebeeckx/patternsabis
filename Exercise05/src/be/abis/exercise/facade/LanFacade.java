package be.abis.exercise.facade;

import java.util.List;


import be.abis.exercise.factory.LanFactory;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.WorkStation;

public class LanFacade {
	
	private final LanFactory lanFactory;

	public LanFacade(LanFactory lanFactory) {
		this.lanFactory = lanFactory;
	}
	
	public List<Node> constructLan(){
		List<Node> nodes = lanFactory.createNodes();
		lanFactory.createLan(nodes);
		return nodes;
	}

	public WorkStation findWorkstation(List<Node> nodes, String address) {
		return lanFactory.findWorkstation(nodes, address);
	}
	
	

}
