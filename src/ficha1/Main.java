package ficha1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!!!!!");

		System.out.println(soma(70, 9));
		System.out.println(subtracao(78, 30));
		System.out.println(operacaoComplexa (3,3));
	}

	public static int soma(int int1, int int2) {
		int soma = int1 + int2;

		return soma;
	}

	public static int subtracao(int int1, int int2) {
		int subtract = int1 - int2;

		return subtract;
	}
	
	public static int mult (int aNum1, int aNum2)
	{
		return aNum1 * aNum2;
	}

	public static int operacaoComplexa (int aNum1, int aNum2)
	{
		return soma (mult (aNum1, aNum2), subtracao (aNum1, aNum2));
	}
	
}
