package Agosto28;

public class Onibus extends Veículos {

	@Override 
	public void acelerar () {
		System.out.println("Acelerando o ônibus");
	}
	
	@Override 
	public void frear () {
		System.out.println("Freando o ônibus");
	}
	@Override 
	public void virar () {
		System.out.println("Virando o ônibus");
	}
	@Override 
	public void ligar () {
		System.out.println("Ligando o ônibus");
	}}