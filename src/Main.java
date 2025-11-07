import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meta = -1;
        double acumulado = 0;

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Criar meta financeira");
            System.out.println("2. Registrar depósito");
            System.out.println("3. Ver status da meta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova meta: ");
                    double novaMeta = scanner.nextDouble();
                    if (novaMeta <= 0) {
                        System.out.println("Meta inválida. Defina um valor maior que zero.");
                    } else {
                        meta = novaMeta;
                        System.out.println("Meta definida com sucesso.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o depósito: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        acumulado += deposito;
                        System.out.println("Depósito registrado. Novo saldo: " + acumulado);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 3:
                    if (meta < 0) {
                        System.out.println("Nenhuma meta definida ainda.");
                    } else {
                        double restante = meta - acumulado;
                        double progresso = (acumulado / meta) * 100;
                        if (progresso > 100) progresso = 100;

                        System.out.println("\nMeta: " + meta);
                        System.out.println("Acumulado: " + acumulado);
                        System.out.println("Falta: " + (restante > 0 ? restante : 0));
                        System.out.println("Progresso: " + progresso + "%");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando programa...");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
