package views;

import java.util.Scanner;

import controllers.FolhaController;
import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;

public class CadastrarFolha {
	
	private static Scanner sc = new Scanner(System.in);
	private static Folha folha;
	private static String cpf;
	private static Funcionario funcionario;
	
	public static void renderizar() {
		
		folha = new Folha();
		
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR FOLHA --\n");
		System.out.println("Digite o CPF do funcionário: ");
		cpf = sc.next();
		funcionario = FuncionarioController.buscarPorCpf(cpf);
		if(funcionario != null) {
			folha.setFuncionario(funcionario);
			System.out.println("Digite o mês: ");
			folha.setMes(sc.nextInt());
			System.out.println("Digite o ano: ");
			folha.setAno(sc.nextInt());
			System.out.println("Digite o valor da hora: ");
			folha.setValor(sc.nextDouble());
			System.out.println("Digite a quantidade de horas: ");
			folha.setHoras(sc.nextInt());
			if(FolhaController.cadastrar(folha)) {
				System.out.println("\nFolha cadastrado com sucesso!");
			}else {
				System.out.println("Essa folha já existe!");
			}
			
		}else {
			System.out.println("Esse funcionário não existe!!!");
		}
		
	}

}
