package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("GrayMane", "M", "Albino");
		lobo.emitirSom();
		
		Leao leao = new Leao("Varion", "M", "Amarelo-Cinza-Azul");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("Zulian", "M", "Laranja");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("Zidrian", "M", "Bege");
		cachorro.emitirSom();
		
		Gato gato = new Gato("Mr.Kitty", "M", "Preto");
		gato.emitirSom();
	}
}