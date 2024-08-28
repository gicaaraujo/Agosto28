package Agosto28;

public class Work implements Computador{


	@Override
	public void ligar () {
		System.out.println(">>>>>>>>>COMPUTADOR WORK<<<<<<<<<");

		System.out.println("Ligando Work");
	}

	@Override
	public void reiniciar () {
		System.out.println("Reiniciando Work");
	}

	@Override
	public void desligar () {
		System.out.println("Manobrando Work");
	}

	@Override 
	public void carregandoSistema () {
		System.out.println("Carregando sistema Work");
	}
}