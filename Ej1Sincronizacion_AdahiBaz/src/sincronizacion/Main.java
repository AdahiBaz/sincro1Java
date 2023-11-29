package sincronizacion;

public class Main {

	 public static void main(String[] args) {
	        Banco banco = new Banco();

	        Cliente cliente1 = new Cliente(banco, "Cliente 1");
	        Cliente cliente2 = new Cliente(banco, "Cliente 2");
	        Cliente cliente3 = new Cliente(banco, "Cliente 3");
	        Cliente cliente4 = new Cliente(banco, "Cliente 4");

	        cliente1.start();
	        
	        try {Thread.sleep(1000);} 
		    catch (InterruptedException e) { }
	        
	        cliente2.start();
	        
	        try {Thread.sleep(1000);} 
		    catch (InterruptedException e) { }
	        
	        cliente3.start();
	        
	        try {Thread.sleep(1000);} 
		    catch (InterruptedException e) { }
	        
	        cliente4.start();
	      
	    }

}
