package views;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
		int opcao;
		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Cadastrar funcionário");
			System.out.println("2 - Cadastrar folha de pagamento");
			System.out.println("3 - Consultar folha de pagamento");
			System.out.println("4 - Consultar histórico de folhas de pagamento do mês");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				CadastrarFuncionario.renderizar();
				break;
			case 2:
				CadastrarFolha.renderizar();
				break;
			case 3:
				ConsultarFolha.renderizar();
				break;
//			case 4:
//				ConsultarHistoricoFolhasmes.renderizar();
//				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		}while (opcao != 5);
	}		
}
