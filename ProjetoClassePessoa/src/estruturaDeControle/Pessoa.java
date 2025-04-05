package estruturaDeControle;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	double altura;
	
	public boolean eMaiorDeIdade() {
		return (idade > 18 ? true:false);
	}
	
	public double calculaIMC() {
		return peso/Math.pow(altura, 2);
	}

}
