package Tema3;

public class PersonaMario {
private String Nombre;
private byte edad;
private double estatura;

// constructor 
PersonaMario(String ParamNombre, byte Paramedad, double Paramestatura){
	
	// ahora se meten los this de cada uno string = etc 
	this.Nombre = ParamNombre;
	this.edad = Paramedad;
	this.estatura = Paramestatura;
}

//metodos

//Creamos el metodo crecer

public void crecer (double incremento) {
	this.estatura += incremento;
}

// Creamos el metodo cumplir años 
public void CumplirAños (){
	this.edad ++;
}

// hacemso get de todos los parametros que tenemos
public byte getEdad() {
	return this.edad;
}

public double getEstatura() {
	return this.estatura;

}

public String getNombre() {
	return this.Nombre;
}

//Ahora hacemos un set de los parametros, nombre = nombre etc...
public void setEdad(byte edad) {
    this.edad = edad;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public void setNombre(String Nombre) {
    this.Nombre = Nombre;
}

//creamos el metodo saludar 
public void Saludar () {
System.out.println("Hola, Mi Nombre es " +Nombre +"\n" + "Encantado de conocerte");
}
@Override
public String toString() {
    return "Persona [Nombre=" + Nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
}
}



