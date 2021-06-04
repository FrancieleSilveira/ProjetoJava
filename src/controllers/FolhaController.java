package controllers; 

import java.util.ArrayList;

import models.Folha;

public class FolhaController {
	
	private static ArrayList<Folha> folhas = new ArrayList<Folha>();
	
	public static boolean cadastrar(Folha folha) {
		String cpf = folha.getFuncionario().getCpf();
		int ano = folha.getAno();
		int mes = folha.getMes();
		if(buscarPorFuncionarioMesAno(cpf, mes, ano) == null) {
			folhas.add(folha);
			return true;
		}
		return false;
	}

	
	public static Folha buscarPorFuncionarioMesAno(String cpf, int mes, int ano) {
		for(Folha folhaCadastrada : folhas) {
			if(folhaCadastrada.getFuncionario().getCpf().equals(cpf) &&
					folhaCadastrada.getMes() == mes &&
					folhaCadastrada.getAno() == ano) {
				return folhaCadastrada;
			}
		}
		return null;
	}
	
	public static ArrayList<Folha> listarPorMesAno(int mes, int ano) {
		ArrayList<Folha> folhasFiltradas = new ArrayList<Folha>();
		for(Folha folhaCadastrada : folhas) {
			if(folhaCadastrada.getMes() == mes && folhaCadastrada.getAno() == ano) {
				folhasFiltradas.add(folhaCadastrada);
			}
		}
		return folhasFiltradas;
	}
}