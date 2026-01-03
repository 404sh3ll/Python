import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            if (opcao == 1) {
                System.out.print("Digite a tarefa: ");
                String tarefa = scanner.nextLine();

                if (!tarefa.isEmpty()) {
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada.");
                } else {
                    System.out.println("Tarefa vazia não foi adicionada.");
                }

            } else if (opcao == 2) {

                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + " - " + tarefas.get(i));
                    }
                }

            } else if (opcao == 3) {

                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa para remover.");
                } else {
                    System.out.print("Número da tarefa para remover: ");

                    int indice;
                    try {
                        indice = Integer.parseInt(scanner.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido.");
                        continue;
                    }

                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                }

            } else if (opcao == 0) {
                System.out.println("Saindo...");

            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
