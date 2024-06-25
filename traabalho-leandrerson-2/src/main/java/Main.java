import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        while (true) {
            System.out.println("\nBloco de Notas - Escolha uma opção:");
            System.out.println("1. Adicionar nota");
            System.out.println("2. Remover nota");
            System.out.println("3. Ver todas as notas");
            System.out.println("4. Procurar nota por título");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o título da nota: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o conteúdo da nota: ");
                    String conteudo = scanner.nextLine();
                    blocoDeNotas.adicionarNota(new Nota(titulo, conteudo));
                    System.out.println("Nota adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o título da nota a ser removida: ");
                    String tituloParaRemover = scanner.nextLine();
                    blocoDeNotas.removerNotaPorTitulo(tituloParaRemover);
                    System.out.println("Nota removida (se existia)!");
                    break;
                case 3:
                    blocoDeNotas.exibirTodasNotas();
                    break;
                case 4:
                    System.out.print("Digite o título da nota a ser procurada: ");
                    String tituloParaProcurar = scanner.nextLine();
                    Nota notaEncontrada = blocoDeNotas.procurarNotaPorTitulo(tituloParaProcurar);
                    if (notaEncontrada != null) {
                        System.out.println(notaEncontrada);
                    } else {
                        System.out.println("Nota não encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}