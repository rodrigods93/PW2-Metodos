
public class Exemplos {
	// escrever somente main e CTRL+ESPAÇO para completar.Esse comando completa
	// qualquer comando digitado.
	public static void main(String[] args) {
		
		int idade=17;
		ehMaiorIdade(19); // Para chamar o metodo(19) O valor dentro do metodo ira rodar o algoritmo					// dentro do metodo e dar uma resposta.
		ehMaiorIdade(30);
		ehMaiorIdade(idade);
		
		classificar(0);

	}

	public static void ehMaiorIdade(int idade) {

		if (idade >= 18) {

			System.out.println("Maior de Idade");// para facilitar digitar somente syso e CTRL+ESPAÇO e completa
													// automaticamente.

		} else {

			System.out.println("Menor de Idade");

		}

	}
	
	public static void classificar(int num) {
		if (num<0) {
			System.out.println("Negativo");
			
		} else if (num >0) {
			System.out.println("Positivo");

		}
		else {
			System.out.println("Nulo");
		}
	}
	
}

// Public: Modificador de acesso para que outras classes tenham acesso ao
// codigo.

// void:Não retorna valor
// nome do metodo.
