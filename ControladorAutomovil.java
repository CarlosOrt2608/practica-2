/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

public class ControladorAutomovil {
	public static void main(String[] args){
		Automovil auto = new Automovil("Ford", "Fiesta");
		auto.encenderMotor();		
		auto.acelerar(50);
		auto.frenar();
	}
}