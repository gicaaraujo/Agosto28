package Agosto28;

public class Carro extends Veículos {

	@Override 
	public void acelerar () {
		System.out.println("Acelerando o carro");
	}
	
	@Override 
	public void frear () {
		System.out.println("Freando o carro");
	}
	@Override 
	public void virar () {
		System.out.println("Virando o carro");
	}
	@Override 
	public void ligar () {
		System.out.println("Ligando o carro");
	}}