package Agosto28;

public class Cachorro extends Animal2 {

	@Override 
	public void dormir () {
		System.out.println("Cachorro dormindo");
	}
	
	@Override 
	public void comer () {
		System.out.println("Cachorro comendo");
	}
	
	@Override 
	public void emitirSom () {
		System.out.println("Cachorro latindo");
	}
	
	@Override 
	public void correr () {
		System.out.println("Cachorro correndo");
	}}