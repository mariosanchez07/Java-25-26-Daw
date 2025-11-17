package Tema3;

public class ClaseCoche {
//toda clase debe tener
	//atributos
	private String sColor;
	private int iVelocidad;
	private double dTamaño;
	
	
	
	// constructror debe llamarse como la clase y el metodo debe ser publico
	public ClaseCoche(String paramColorCoche, int paramVelocidadCoche,double paramTamañoCoche ) {
		this.sColor = paramColorCoche;
		this.iVelocidad = paramVelocidadCoche;
		this.dTamaño = paramTamañoCoche;
	
	}
	
	
	
	//metodos: acciones que puede realizar
	public void avanzar (){};
	public void Parar (){};
	public void GirarIzquierda (){};
	public void GirarDerecha (){};
	public void MarchaAtras (){};

	
	
	//getter y setter
	public void setColor (String sNuevoColor) {
		this.sColor = sNuevoColor;
	}
public String getColor () {
	return this.sColor;	
}

public void setVelocidad (int iNuevaVelocidad) {
	this.iVelocidad = iNuevaVelocidad;
}
public int getVelocidad () {
return this.iVelocidad;	
}
public void setColor (double dNuevoTamaño) {
	this.dTamaño = dNuevoTamaño;
}
public double getTamaño () {
return this.dTamaño;	
}


//pintar el objeto por pantalla





}
