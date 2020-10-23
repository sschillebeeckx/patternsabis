package be.abis.exercise.factory;

import java.util.List;

import be.abis.exercise.model.Node;
import be.abis.exercise.model.WorkStation;

public abstract class LanFactory {
	
	public static LanFactory createFactory(LanType lt) {
		switch (lt) {
		  default :
		  case SIMPLE:
			return SimpleLanFactory.getInstance();
		  case EXTENDED:
			return ExtendedLanFactory.getInstance();		 
		}
	}
	
	public abstract List<Node> createNodes();
	
	public void createLan(List<Node> nodes) {
        for (int i=0; i<nodes.size();i++){
       	 Node n1 = nodes.get(i);
       	 Node n2=null;
       	 if (i!=nodes.size()-1){
       	     n2 = nodes.get(i+1);
       	 } else {
       		 n2=nodes.get(0);
       	 }        	 
       	 n1.setNextComponent(n2);
        }		
	}
	
	public WorkStation findWorkstation(List<Node> nodes,String address){
		WorkStation w1 = 
				(WorkStation) nodes.stream()
				 .filter(n -> n instanceof WorkStation)
				 .filter(n -> n.getAddress().equals(address))
				 .findFirst().orElse(null);
        return w1;
	}
	
	


}
