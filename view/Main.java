package model;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opção: ");
        System.out.println("1 - Cadastrar Pet ");
        System.out.println("2 - Cadastrar Pessoa ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("--- CADASTRO DO PET --- ");
                System.out.println("Digite o nome do seu pet: ");
                String nomePet = scanner.nextLine();
                System.out.println("Digite a idade do seu pet: ");
                int idadePet = scanner.nextInt();
                System.out.println("Digite a especie do seu pet: ");
                String especiePet = scanner.nextLine();
                System.out.println("Digite a raça do seu pet: ");
                String racaPet = scanner. nextLine();

                Pet petinho();

                petDAO.salvar(petinho);
                break;

            case 2:
                System.out.println("--- CADASTRO DO CLIENTE ---");
                System.out.println("Digite seu nome: ");
                System.out.println("Digite seu CPF: ");
                System.out.println("Digite seu telefone: ");
                System.out.println("Digite seu endereço: ");
                break;

            // Você pode adicionar quantos cases precisar...
            default:
                System.out.println("Digite uma opção valida!");
                break;
        }
    }
}
