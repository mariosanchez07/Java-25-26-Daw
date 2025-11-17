package Tema3;

public class LibroMario {

	public class LibroMario {
	private String Titulo;
	private String Autor;
	private int Paginastotales;

		public Cuentabancariastatic(String titular, String Autor, int Paginastotales) {
	        this.titular = Titular;
	    	this.Autor = Autor;
	        this.Paginastotales = Paginastotales;
	        this.Paginastotalesleidas = 0;
	    }
		 // Método para leer (método de instancia)
	    
	    public void leer( int cantidad) {
	        Paginastotales += cantidad;
	        System.out.println("Se han leido  " + cantidad );
	    }
	    
	    // Método para saber si termine el libro (método de instancia)
	    /**
	     * @param cantidad
	     */
	    public void Terminar(int cantidad) {
	        if (cantidad  < Paginastotales) {
	            System.out.println("has leido", +cantidad , "Te quedan paginas por leer");
	        } else {
	            Paginastotales += cantidad;
	            System.out.println("Se ha retirado " + cantidad + "€. Saldo actual: " + saldo + "€");
	        }
	    }

	}

}
