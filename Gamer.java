package Agosto28;

public class Gamer implements Computador {

	@Override
	public void ligar () {
		System.out.println(">>>>>>>>>COMPUTADOR GAMER<<<<<<<<<");

		System.out.println("Ligando Gamer");
	}

	@Override
	public void reiniciar () {
		System.out.println("Reiniciando Gamer");
	}

	@Override
	public void desligar () {
		System.out.println("Manobrando Gamer");
	}

	@Override 
	public void carregandoSistema () {
		System.out.println("Carregando sistema Gamer");
	}
}
