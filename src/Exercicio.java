
public class Exercicio {
	public static int somar(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public static int proximo(int num1) {
		return num1 + 1; 
	}
	
	public static int dobro(int num1) {
		return num1 * 2;
	}
	public static void main(String[] args) {
		int valorSoma = somar(2,3);
		System.out.println("Valor da Soma: "+ valorSoma);
		
		int proximoNumero= proximo(valorSoma);
		System.out.println("Próximo Numero: "+proximoNumero);
		
		int dobroNumero= dobro(5);
		System.out.println("O dobro he: "+ dobroNumero);
	}

}
