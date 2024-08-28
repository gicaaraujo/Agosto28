package Agosto28;

public class Calculando implements Cálculos {

	@Override
	public double somar() {
		return 10+15;
	}

	@Override
	public double subtrair() {
		return 15-10;
	}

	@Override
	public double multiplicar() {
		return 10*15;	}

	@Override
	public int dividir() {
		return 15/10;
	}

	@Override
	public int exponencial() {
		return 5*5*5;
	}
}