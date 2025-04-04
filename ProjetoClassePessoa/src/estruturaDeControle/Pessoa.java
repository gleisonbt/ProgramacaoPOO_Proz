package estruturaDeControle;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	
	public boolean eMaiorDeIdade() {
		if (idade > 17) {
			return true;
		} else {
			return false;
		}
	}

}
