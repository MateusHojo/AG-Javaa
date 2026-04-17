import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro meuLivro = null;
        int opcao = 0;

        do {
            System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Exibir Dados do Livro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String t = leitor.nextLine();
                    System.out.print("Autor: ");
                    String a = leitor.nextLine();
                    System.out.print("Páginas: ");
                    int p = leitor.nextInt();
                    meuLivro = new Livro(t, a, p);
                    System.out.println("Livro cadastrado!");
                    break;
                case 2:
                    if (meuLivro != null) System.out.println(meuLivro.toString());
                    else System.out.println("Nenhum livro cadastrado.");
                    break;
                case 3:
                    if (meuLivro != null) meuLivro.emprestar();
                    break;
                case 4:
                    if (meuLivro != null) meuLivro.devolver();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        leitor.close();
    }
}