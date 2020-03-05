
public class ExemplosComRetorno {

	public static String concatenar(String nome, String sobrenome) { // quando declarar uma string colocar o primeiro s
																		// em
																		// maiusculo.

		return nome + " " + sobrenome;
	}

	public static int tamanhoNomeCompleto(String nome, String sobrenome) {
		String nomeCompleto = concatenar(nome, sobrenome);
		return nomeCompleto.length(); // vai retornar a quantidade de caracteres dentro da String.
	}

	public static void main(String[] args) {

		String nome = concatenar("Rodrigo", "Dantas"); // A string nome sera igual o metodo concatenar
		int tamanho = tamanhoNomeCompleto("Rodrigo", "Dantas");// a variavel tamanho vai ser igual ao metodo
																// "tamanhoNomeCompleto"
		System.out.println("Nomes:" + nome);
		System.out.println("Qtde: " + tamanho + " caracteres");

	}

}
