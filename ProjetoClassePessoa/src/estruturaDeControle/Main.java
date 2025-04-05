package estruturaDeControle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		/*String nome  = JOptionPane.showInputDialog("Nome: ");
		while (!nome.equals("")) {
			nome = JOptionPane.showInputDialog("Nome: ");
			
		}*/
		
		/*String nome;
		do {
			nome = JOptionPane.showInputDialog("Nome: ");
		} while (!nome.equals(""));*/
		
		/*Pessoa p = new Pessoa();
		do {
			p.nome = JOptionPane.showInputDialog("Nome: ");
			if (!p.nome.equals("")) {
				p.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
				if (p.eMaiorDeIdade()) {
					JOptionPane.showMessageDialog(null, "Maior de Idade!");
				} else {
					JOptionPane.showMessageDialog(null, "Menor de Idade!");
				}
			}
		} while (!p.nome.equals(""));*/
		
		/*Pessoa p = new Pessoa();
		for (int i = 0; i < 5; i++) {
			p.nome = JOptionPane.showInputDialog("Nome: ");
			if (!p.nome.equals(""))
				p.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			else
				i = 5;
			
		}*/
		
		/*int[] vetorInteiros = new int[5];
		for (int i = 0; i < vetorInteiros.length; i++) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
		}
		
		int soma = 0;
		for (int i = 0; i < vetorInteiros.length; i++) {
			//System.out.println(vetorInteiros[i]);
			soma += vetorInteiros[i];
		}
		JOptionPane.showMessageDialog(null, soma);*/
		
		/*int[] vetorInteiros = new int[5];
		for (int i = 0; i < vetorInteiros.length; i++) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.
					showInputDialog("Valor: "));
		}
		
		String listaNumeros = "";
		for (int i = 0; i < vetorInteiros.length; i++) {
			//System.out.println(vetorInteiros[i]);
			listaNumeros += vetorInteiros[i] + " ";
		}
		JOptionPane.showMessageDialog(null, listaNumeros);*/
		
		/*int qtdePessoas  = Integer.parseInt(JOptionPane.
				showInputDialog("Informe a quantidade de pessoas: "));
		Pessoa[] pessoas = new Pessoa[qtdePessoas];
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa p = new Pessoa();
			p.nome = JOptionPane.showInputDialog("Nome: ");
			p.idade = Integer.parseInt(JOptionPane.
					showInputDialog("Idade: "));
			pessoas[i] = p;
		}*/
		
		/*String resultado = "";
		for (int i = 0; i < pessoas.length; i++) {
			String mensagemMaiorIdade = "";
			if(pessoas[i].eMaiorDeIdade()) {
				mensagemMaiorIdade = "Maior de Idade";
			} else {
				mensagemMaiorIdade = "Menor de Idade";
			}
			
			resultado += pessoas[i].nome + " - " + mensagemMaiorIdade + "\n";
		}
		
		JOptionPane.showMessageDialog(null, resultado);*/
		
		/*int[] vetorExemploForEach = {7,8,9,0,2,10};
		for (int i : vetorExemploForEach) {
			System.out.println(i);
		}*/
		/*String resultado = "";
		for (Pessoa pessoa : pessoas) {
			
			String mensagemMaiorIdade = (pessoa.eMaiorDeIdade() ?
					"Maior de Idade":"Menor de Idade");
			
			resultado += pessoa.nome + " - " + mensagemMaiorIdade + "\n";
		}
		JOptionPane.showMessageDialog(null, resultado);*/
		/*
		List<Integer> listaInteiros = new ArrayList<>();
		listaInteiros.add(2);
		listaInteiros.add(10);
		for (Integer integer : listaInteiros) {
			System.out.println(integer);
		}*/

		/*
		List<String> listaNomes = new ArrayList<>();
		String nome;
		do {
			nome = JOptionPane.showInputDialog("Nome: ");
			listaNomes.add(nome);
		} while (!nome.equals(""));*/
		
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		String nomePessoa = JOptionPane.showInputDialog("Nome: ");
		while (!nomePessoa.equals("")) {
			Pessoa p = new Pessoa();
			p.nome = nomePessoa;
			p.idade  = Integer.parseInt(JOptionPane.
					showInputDialog("Idade: "));
			p.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
			p.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
			
			listaPessoas.add(p);
			
			nomePessoa = JOptionPane.showInputDialog("Nome: ");
		}
		
		String resultado = "";
		for (Pessoa pessoa : listaPessoas) {
			String mensagemMaiorIdade = (pessoa.eMaiorDeIdade() ?
					"Maior de Idade":"Menor de Idade");
			
			resultado += pessoa.nome + " - " + mensagemMaiorIdade + 
					" " + String.format(Locale.US, "%.2f", pessoa.calculaIMC())  + "\n";
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	
	}

}
