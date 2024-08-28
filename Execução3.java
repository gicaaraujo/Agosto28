package Agosto28;

public class Execução3 {

	public static void main(String[] args) {

		Gamer jogo = new Gamer ();
		Home casual = new Home ();
		Work trabalho = new Work ();

		
		jogo.ligar();
		jogo.reiniciar();
		jogo.desligar();
		jogo.carregandoSistema();
		
		casual.ligar();
		casual.reiniciar();
		casual.desligar();
		casual.carregandoSistema();	
		
		trabalho.ligar();
		trabalho.reiniciar();
		trabalho.desligar();
		trabalho.carregandoSistema();
	}

}
