package be.abis.demo.model;

public class TestAdapter {

	public static void main(String[] args) {

        Socket s = new Socket();
        
        Phone p = new Phone();
        
        SocketAdapter sa = new PhoneToSocketAdapter();
        sa.setPhone(p);
        
        s.pluginPhone(sa);

	}

}
