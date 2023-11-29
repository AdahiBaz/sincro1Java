package sincronizacion;

class Cliente extends Thread {
	
    private Banco banco;
    private String nombre;

    public Cliente(Banco banco, String nombre) {
        this.banco = banco;
        this.nombre = nombre;
    }

    
    @Override
    public void run() {
    	
        banco.ingresarBanco(nombre);

        try {Thread.sleep(5000);} 
        catch (InterruptedException e) { }

        banco.salirBanco(nombre);
        
    }
}