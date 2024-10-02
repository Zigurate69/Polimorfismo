package Polimorfismo;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario(1, "João Pedro","15-9999-9999", 123, "Rua Carlinhos");
		System.out.println(fun.getNome());
		System.out.println(fun.calcularSalario(10000.00, 1000));
		
		Horista hor = new Horista(2, "Samuel Oliveira","15-99187-9221", 1234, "Rua Dalva");
		System.out.println(hor.getNome());
		System.out.println(hor.calcularSalario(100, 200));
		
		Jornada jor = new Jornada(3, "Lucas Eduardo", "15-9999-9999", 12345, "Rua Cleide");
		System.out.println(jor.getNome());
		System.out.println(jor.calcularSalario(150, 220));
		
		ConsultorPj consul = new ConsultorPj(4, "Samuel Freitas", "15-98189-7434", 123456, "Rua Gabriela Rodrigues");
		System.out.println(consul.getNome());
		System.out.println(consul.calcularSalario(40000, 5000));
	}
}