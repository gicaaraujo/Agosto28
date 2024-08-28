package Agosto28;

public class Home implements Computador{


	@Override
	public void ligar () {
		System.out.println(">>>>>>>>>COMPUTADOR HOME<<<<<<<<<");

		System.out.println("Ligando Home");
	}

	@Override
	public void reiniciar () {
		System.out.println("Reiniciando Home");
	}

	@Override
	public void desligar () {
		System.out.println("Manobrando Home");
	}

	@Override 
	public void carregandoSistema () {
		System.out.println("Carregando sistema Home");
	}
}