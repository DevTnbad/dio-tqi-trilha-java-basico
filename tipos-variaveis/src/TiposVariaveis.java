public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // tipos primitivos
        double salarioinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Como o tipo int da variavel numeroNormal é mais abrangente 
        // que o tipo short do numeroCurto2 é possivel fazer essa adaptacao para ceber o tipo adequado.

        int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print("O valor é: " + numero);

        /*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		//VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

        // estude a classe String que representa testo na aplicacao
        String meuNome = "Toddy";

    }
}
