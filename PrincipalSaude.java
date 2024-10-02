package Polimorfismo;

public class PrincipalSaude {
	public static void main(String[] args) {
		ProfissionalSaude profissionalS = new ProfissionalSaude("Samuel", "x", 1);
		System.out.println(profissionalS.getEspecialidade());
		profissionalS.agendarConsulta();
		
		Medico medico = new Medico("Samuel", "x", 1, "Válido");
		System.out.println(profissionalS.getEspecialidade());
		medico.agendarConsulta();
		
		Dentista denstista = new Dentista("Samuel", "x", 1, "Válido");
		System.out.println(denstista.getNome());
		denstista.agendarConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Samuel", "x", 1, "Válido");
		System.out.println(fisioterapeuta.getNome());
		fisioterapeuta.agendarConsulta();
	}
}


