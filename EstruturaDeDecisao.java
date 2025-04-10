package br.com.prozeducacao.estruturasDeControle;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		//int idade  = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		//JOptionPane.showMessageDialog(null, idade);
		
		//Condicional simples
		/*
		if (idade > 17) {
			JOptionPane.showMessageDialog(null, "Já pode ser preso");
		}*/
		
		//Condicional ifelse
		/*
		if (idade > 17) {
			JOptionPane.showMessageDialog(null, "Maior de Idade");
		} else {
			JOptionPane.showMessageDialog(null, "Menor de Idade");
		}*/
		
		
		//Escada de If's
		/*
		if (idade >= 0 && idade <= 12) {
			JOptionPane.showMessageDialog(null, "Criança!");
		} else {
			if (idade >= 13 && idade <= 17) {
				JOptionPane.showMessageDialog(null, "Adolescente!");
			} else {
				if (idade >= 18 && idade <= 59) {
					JOptionPane.showMessageDialog(null, "Adulto!");
				} else {
					JOptionPane.showMessageDialog(null, "Idosa!");
				}
			}
		}*/
		
		//Escada de IF's com else if
		/*if (idade < 0) {
			JOptionPane.showMessageDialog(null, "Idade Invalida");
		} else if(idade < 13) {
			JOptionPane.showMessageDialog(null, "Crianca!");
		} else if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Adolescente!");
		} else if (idade < 60) {
			JOptionPane.showMessageDialog(null, "Adulto!");
		} else {
			JOptionPane.showMessageDialog(null, "Idosa!");
		}*/
		
		//COndicional switch case
		int opcao = Integer.parseInt(JOptionPane.
				showInputDialog("Selecione uma opcao: "
						+ "\n 0 - soma"
						+ "\n 1 - subtracao"
						+ "\n 2 - multiplicacao"
						+ "\n 3 - divisao"));
		int num1 = Integer.parseInt(JOptionPane.
				showInputDialog("Numero 1: "));
		int num2 = Integer.parseInt(JOptionPane.
				showInputDialog("Numero 2: "));
		switch (opcao) {
		case 0: {
			JOptionPane.showMessageDialog(null, num1 + num2);
			break;
		}
		case 1: {
			JOptionPane.showMessageDialog(null, num1 - num2);
			break;
		} 
		case 2: {
			JOptionPane.showMessageDialog(null, num1 * num2);
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, num1 / num2);
			break;
		}
		default: {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
			
		}
		
		
	}
	
	
	
}
