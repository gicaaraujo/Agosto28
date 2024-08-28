package Agosto28;

public class Execucao6 {

	public static void main(String[] args) {

		Lobo2 tom = new Lobo2 ();
		Leão simba = new Leão ();
		Tigre polo = new Tigre ();
		Cachorro lessie = new Cachorro ();
		Gato marie = new Gato ();
		
		// LOBO
		System.out.println("      LOBO      ");
		tom.setnome("Tom");
		tom.setsexo("masculino");
		tom.setraca("lobinho");
	
		System.out.println(tom.getnome());
		System.out.println(tom.getsexo());
		System.out.println(tom.getraca());
		
		tom.dormir();
		tom.comer();
		tom.correr();	
		tom.emitirSom();

		
		// LEÃO
				System.out.println("      LEÃO      ");
				
				simba.setnome("Simba");
				simba.setsexo("masculino");
				simba.setraca("leãozinho");
			
				System.out.println(simba.getnome());
				System.out.println(simba.getsexo());
				System.out.println(simba.getraca());
				
				simba.dormir();
				simba.comer();
				simba.correr();	
				simba.emitirSom();
				
				
				// TIGRE
				System.out.println("      TIGRE      ");
				
				polo.setnome("polo");
				polo.setsexo("masculino");
				polo.setraca("tigrinho");
			
				System.out.println(polo.getnome());
				System.out.println(polo.getsexo());
				System.out.println(polo.getraca());
				
				polo.dormir();
				polo.comer();
				polo.correr();	
				polo.emitirSom();			


				// CACHORRO
				System.out.println("      CACHORRO      ");
				
				lessie.setnome("lessie");
				lessie.setsexo("feminino");
				lessie.setraca("lulu da pomerânia");
			
				System.out.println(lessie.getnome());
				System.out.println(lessie.getsexo());
				System.out.println(lessie.getraca());
				
				lessie.dormir();
				lessie.comer();
				lessie.correr();	
				lessie.emitirSom();	
				
				
				// GATO
				System.out.println("      GATO      ");
				
				marie.setnome("marie");
				marie.setsexo("feminino");
				marie.setraca("gatinha");
			
				System.out.println(marie.getnome());
				System.out.println(marie.getsexo());
				System.out.println(marie.getraca());
				
				marie.dormir();
				marie.comer();
				marie.correr();	
				marie.emitirSom();	

	}

}
