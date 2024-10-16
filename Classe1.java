import java.util.*; // Importa todas as classes do pacote java.util, que inclui Scanner

public class Classe1 { // Declara a classe chamada Classe1
    public static void main(String[] args) { // Método principal onde a execução do programa começa
        Scanner scnInputUsuario = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Olá! Bem vindo a calculadora de Java. Digite o primeiro número a ser calculado e tecle: \"enter\"."); // Exibe uma mensagem de boas-vindas ao usuário
        int intInputUsuario1 = scnInputUsuario.nextInt(); // Lê a linha de entrada do usuário e armazena na variável strInputUsuario
        System.out.println("Digite o segundo número a ser somado e tecle: \"enter\".");
        int intInputUsuario2 = scnInputUsuario.nextInt();
        System.out.println("Digite o número da opção desejada e tecle: \"Enter\".");
        String[] opcoes = Classe2.mostrarOpcoes();
        
        for (int count = 0; count < opcoes.length; count++) {
            System.out.println(count + " - " + opcoes[count]);
        }

        int opcaoEscolhida = scnInputUsuario.nextInt();

        System.out.println("O resultado da " + opcoes[opcaoEscolhida] + Classe2.resultado (intInputUsuario1 , intInputUsuario2 , opcaoEscolhida));
        scnInputUsuario.close(); // Fecha o objeto Scanner para liberar recursos
    }
}
