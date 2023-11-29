package sincronizacion;

class Banco {
	
    private int clientesEnBanco = 0;

    public synchronized void ingresarBanco(String nombreCliente) {
    	
        while (clientesEnBanco >= 2) {
        	
            try {
            	
                System.out.println(nombreCliente + " está esperando para ingresar al banco.\n");
                wait();
                
            } catch (InterruptedException e) {}
            
        }

        clientesEnBanco++;
        System.out.println(nombreCliente + " ha ingresado al banco.\nClientes en el banco: " + clientesEnBanco);
        
    }

    public synchronized void salirBanco(String nombreCliente) {
    	
        clientesEnBanco--;
        System.out.println(nombreCliente + " ha salido del banco.\nClientes en el banco: " + clientesEnBanco);
        notifyAll();
        
    }
    
}