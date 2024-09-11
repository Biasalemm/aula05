package POOAula2;

import atividades.Pessoa;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa  pessoa1 = new Pessoa();
		Pessoa pessoa2= new Pessoa();

		pessoa1.setNome("Tom cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California,USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCPF(23435454-21L);
		pessoa1.setRG(234876552-1L);
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami,USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setCPF(23435455-61L);
		pessoa2.setRG(234677552-1L);
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.CPF());
		System.out.println(pessoa1.RG());
	

		System.out.println("-----OBJETO 2-----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.CPF());
		System.out.println(pessoa2.RG());
	}

}
