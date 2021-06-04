package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
	
	private static Funcionario funcionario;
	private static Scanner sc = new Scanner(System.in);
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void renderizar() throws ParseException {
		
		funcionario = new Funcionario();
		
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR FUNCIONARIO --\n");
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.setNome(sc.next());
		System.out.println("Digite o CPF do funcion�rio: ");
		funcionario.setCpf(sc.next());
		System.out.println("Digite a data de nascimento do funcion�rio (DD/MM/AAAA): ");
		Date nascimento = sdf.parse(sc.next());
		funcionario.setNascimento(nascimento);
		//funcionario.setNascimento(new Date(sc.next()));
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\nFuncion�rio cadastrado com sucesso!");
		}else {
			System.out.println("Esse funcion�rio j� existe!");
		}
	}
}
