package controllers; //Um controller para cada modelo, dentro dele colocamos as ações que podem ser executadas com cada modelo (cadastrar, listar, buscar...) 

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static boolean cadastrar(Funcionario funcionario) {
		if(buscarPorCpf(funcionario.getCpf()) == null) {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}
	
//	public static boolean deletar(Funcionario funcionario) {
//		for(Funcionario funcionarioCadastrado : funcionarios) {
//			if(funcionario.getCpf().equals(funcionarioCadastrado.getCpf())) {
//				funcionarios.remove(funcionarioCadastrado);
//				return true;
//			}
//		}
//		return false;
//	}
	
//	public static boolean alterar(String nome, String cpf) {
//		for(Funcionario clienteCadastrado : funcionarios) {
//			if(cpf.equals(clienteCadastrado.getCpf())) {
//				clienteCadastrado.setNome(nome);
//			return true;
//			}
//		}
//		return false;
//	}

	
	public static Funcionario buscarPorCpf(String cpf) {
		for(Funcionario funcionarioCadastrado : funcionarios) {
			if(funcionarioCadastrado.getCpf().equals(cpf)) {
				return funcionarioCadastrado;
			}
		}
		return null;
		
	}
}