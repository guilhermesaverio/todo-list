import service.TodoService;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        TodoService service = new TodoService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== TODO LIST =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = sc.nextLine();
                    service.adicionarTarefa(desc);
                    break;
                case 2:
                    service.listarTarefas();
                    break;
                case 3:
                    System.out.print("Número da tarefa para concluir: ");
                    int c = sc.nextInt();
                    service.concluirTarefa(c);
                    break;
                case 4:
                    System.out.print("Número da tarefa para remover: ");
                    int r = sc.nextInt();
                    service.removerTarefa(r);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
