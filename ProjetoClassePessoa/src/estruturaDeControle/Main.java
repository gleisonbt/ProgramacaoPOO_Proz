package estruturaDeControle;

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
		
		int[] vetorInteiros = new int[5];
		for (int i = 0; i < vetorInteiros.length; i++) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.
					showInputDialog("Valor: "));
		}
		
		String listaNumeros = "";
		for (int i = 0; i < vetorInteiros.length; i++) {
			//System.out.println(vetorInteiros[i]);
			listaNumeros += vetorInteiros[i] + " ";
		}
		JOptionPane.showMessageDialog(null, listaNumeros);
	
	}

}
