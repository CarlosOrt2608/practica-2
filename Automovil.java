/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
* Automovil.java
*
* @author Héctor Quej Cosgaya
* @author José Aguilar Canepa
*
* @created 05/11/12 10:50 PM
*
* Esta clase modela un Automovil y su funcionamiento básico.
*/
public class Automovil {
	
	int velocidad = 0;			// La velocidad a la que se desplaza el auto
	boolean motor = false;		// Representa si el motor está encendido (true) o apagado (false)
	String color;				// El color del auto
	String modelo;				// El modelo del auto
	static String marca;			// La marca del auto
	static int numeroDeAutos = 0;	// La cantidad total de autos que se han creado
	
	/**
	* Inicializa un nuevo objeto Automovil.
	* 
	* @param fabricante: La compañía que fabricó el automovil. Este valor se convertirá en el atributo marca del auto.
	* @param tipo: El nombre del modelo del automovil. Este valor se convertirá en el atributo modelo del auto.
	*/
	public Automovil(String fabricante, String tipo){
		modelo = tipo;
		marca = fabricante;
		numeroDeAutos++;
	}
	
	/**
	* Enciende el motor del automovil.
	*/
	public void encenderMotor() {
		motor = true;
		System.out.println("Motor encendido");
	}
	
	/**
	* Apaga el motor del automovil.
	*/
	public void apagarMotor() {
		motor = false;
		System.out.println("Motor apagado");
	}
	
	/**
	* Incrementa la velocidad del automovil en la cantidad de kilómetros/hora especificada.
	*
	* @param cantidad: El número de km/h en que aumentará la velocidad del auto.
	*/
	public void acelerar(int cantidad) {
		if (motor) {
			velocidad += cantidad;
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor está apagado!");
		}
	}
	
	/**
	* Reduce a cero la velocidad del auto.
	*/
	public void frenar() {
		velocidad = 0;
		System.out.println("Nos hemos detenido!");
	}
	
	/**
	* Nos muestra la velocidad a la que se está desplazando el auto.
	* 
	* @return la velocidad del auto.
	*/
	public int verVelocidad() {
		return velocidad;
	}
	
	/**
	* Duplica la velocidad recibida.
	*
	* @param velocidad: la velocidad que será duplicada.
	*/
	public void duplicarVelocidad(int velocidad){
		velocidad *= 2;
		System.out.println("Ahora vas a " + velocidad + " km/h!");
	}
	
	/**
	* Nos muestra la cantidad total de autos que se han creado a partir de la clase.
	* 
	* @return el total de autos creados.
	*/
	public static int verNumeroDeAutos(){
		return numeroDeAutos;
	}
	
	/**
	* Cambia el color del objeto 'auto' especificado a Negro
	*
	* @param auto: La instancia de la clase Automovil cuyo color será cambiado.
	*/
	public static void pintar(Automovil auto){
		auto.color = "Negro";
	}
}